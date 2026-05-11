package com.example.demo.service;

import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class StatistiqueTests {

    @MockBean
    StatistiqueImpl statistiqueImpl;

    @Test
    void ajouterVoiture() {
        Voiture voiture = new Voiture("Ferrari", 5000);

        statistiqueImpl.ajouter(voiture);

        verify(statistiqueImpl, times(1)).ajouter(voiture);
    }

    @Test
    void calculerPrixMoyen() {
        Echantillon echantillon = new Echantillon(2, 7500);

        when(statistiqueImpl.prixMoyen()).thenReturn(echantillon);

        Echantillon resultat = statistiqueImpl.prixMoyen();

        assertEquals(2, resultat.getNombreDeVoitures());
        assertEquals(7500, resultat.getPrixMoyen());

        verify(statistiqueImpl, times(1)).prixMoyen();
    }
}