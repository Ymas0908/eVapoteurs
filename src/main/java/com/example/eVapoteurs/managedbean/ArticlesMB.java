package com.example.eVapoteurs.managedbean;

import com.example.eVapoteurs.model.Articles;
import com.example.eVapoteurs.services.ArticlesServices;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class ArticlesMB {

    @Getter
    @Setter
    private ArticlesMB profilUtilisateur;


    @Getter
    @Setter
    private List<Articles> articlesList;
    @Getter
    @Setter
    @Inject
    private ArticlesServices articlesServices;

    @PostConstruct
    public void init() {
        articlesList = new ArrayList<com.example.eVapoteurs.model.Articles>();
        articlesList = articlesServices.getAllArticles(10);
    }

}