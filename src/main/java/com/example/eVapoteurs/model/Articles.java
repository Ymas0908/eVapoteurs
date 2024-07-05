package com.example.eVapoteurs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Articles {
    private Integer id;
    private String nom;
    private String description;
    private String image;
    private double prix;
    public Articles(int id) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.image = image;
        this.prix = prix;

    }

}



