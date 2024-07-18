package com.example.eVapoteurs.managedbean;

import com.example.eVapoteurs.model.Articles;
import com.example.eVapoteurs.services.ArticlesServices;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Named
public class ArticlesMB implements Serializable {

    @Getter
    @Setter
    private List<Articles> articlesList;

    @Inject
    private ArticlesServices articlesServices;

    @PostConstruct
    public void init() {
        Articles Articles = new Articles();

        articlesList = articlesServices.getAllArticles();
    }
}
