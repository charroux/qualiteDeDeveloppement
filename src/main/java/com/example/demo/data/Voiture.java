package com.example.demo.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voiture {
    int id;
    String marque;
    float prix;

    public Voiture() {
        marque = "" ;
        prix = 0 ;
    }

    public Voiture(String marque, float prix) {
        this.marque = marque;
        this.prix = prix;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getMarque() {
        return marque;
    }

    public float getPrix() {
        return this.prix ;
    }

    public void setPrix(float p) {
        this.prix = p ;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "id=" + id +
                '}';
    }
}
