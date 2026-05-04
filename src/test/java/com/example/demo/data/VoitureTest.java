package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
        Voiture voiture = new Voiture("Ferrari", 5000);
        assertEquals("Ferrari", voiture.getMarque());
        assertEquals(5000, voiture.getPrix());

    }
    @Test
    void modifierVoiture(){
        Voiture voiture = new Voiture();

        voiture.setId(1);
        voiture.setMarque("Mercedes");
        voiture.setPrix(10000);

        assertEquals("Mercedes", voiture.getMarque());
        assertEquals(10000, voiture.getPrix());
        assertEquals(1, voiture.getId());
    }

    @Test
    void TestToString(){
        Voiture voiture = new Voiture("Mercedes", 10000);
        voiture.setId(1);

        String test = voiture.toString();

        assertTrue(test.contains("Mercedes"));
        assertTrue(test.contains("10000"));
        assertTrue(test.contains("1"));
    }

}
