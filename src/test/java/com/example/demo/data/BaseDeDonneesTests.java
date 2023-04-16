package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;

import static org.mockito.Mockito.when;

@SpringBootTest
public class BaseDeDonneesTests {

    @MockBean
    private VoitureRepository voitureRepository;

    @Test
    void uneVoiture(){
        Voiture voiture = Mockito.mock(Voiture.class);
        voiture.setMarque("Peugeot");
        voiture.setPrix(10000);
        voitureRepository.save(voiture);
        when(voitureRepository.findAll()).thenReturn(Collections.singletonList(voiture));
    }

    @Test
    void count(){
        Voiture voiture = Mockito.mock(Voiture.class);
        voitureRepository.save(voiture);
        when(voitureRepository.count()).thenReturn(1);
    }

}
