package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture() {
        Voiture voiture = new Voiture();
        assertNotNull(voiture);
    }

    @Test
    void testConstructeurParDefaut() {
        Voiture voiture = new Voiture();
        assertEquals("", voiture.getMarque());
        assertEquals(0, voiture.getPrix());
    }

    @Test
    void testConstructeurAvecParams() {
        Voiture voiture = new Voiture("Toyota", 20000);
        assertEquals("Toyota", voiture.getMarque());
        assertEquals(20000, voiture.getPrix());
    }

    @Test
    void testSetGetMarque() {
        Voiture voiture = new Voiture();
        voiture.setMarque("Honda");
        assertEquals("Honda", voiture.getMarque());
        Voiture voiture2 = new Voiture();
        voiture2.setMarque("Lexus");
        assertEquals("Lexus", voiture2.getMarque());
    }

    @Test
    void testSetGetPrix() {
        Voiture voiture = new Voiture();
        voiture.setPrix(15000);
        assertEquals(15000, voiture.getPrix());
    }

    @Test
    void testSetGetId() {
        Voiture voiture = new Voiture();
        voiture.setId(1);
        assertEquals(1, voiture.getId());
    }

    @Test
    void testToString() {
        Voiture voiture = new Voiture();
        voiture.setId(1);
        String expected = "Voiture{id=1}";
        assertEquals(expected, voiture.toString());
    }
}
