package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
        Voiture voiture = new Voiture();
        voiture.setMarque("Peugeot");
        voiture.setPrix(10000);
        Assert.notNull(voiture, "La voiture ne peut pas être null");
        Assert.notNull(voiture.getMarque(), "La marque ne peut pas être null");
    }

    @Test
    void prix(){
        Voiture voiture = new Voiture()
        voiture.setPrix(10000);
        Assert.isTrue(voiture.getPrix() == 10000, "Le prix doit être egal à 10000");
    }
}
