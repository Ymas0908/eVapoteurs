package com.example.eVapoteurs.services;

import com.example.eVapoteurs.model.Articles;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Service
public class ArticlesServices {
    private List<Articles> articlesList = new ArrayList<>();
    public List<Articles> getAllArticles(int size) {
        articlesList.add(new Articles(1, "Vapoteur 1", "Coca Cola", "coca.jpg", 13000  ));
        articlesList.add(new Articles(2, "Vapoteur 2", "Coca Cola", "coca.jpg", 1.5));
        articlesList.add(new Articles(3, "Vapoteur 3", "Coca Cola", "coca.jpg", 1.5));
        articlesList.add(new Articles(4, "Vapoteur 4", "Coca Cola", "coca.jpg", 1.5));
        articlesList.add(new Articles(5, "Vapoteur 5", "Coca Cola", "coca.jpg", 1.5));
        articlesList.add(new Articles(6, "Vapoteur 6", "Coca Cola", "coca.jpg", 1.5));
        articlesList.add(new Articles(7, "Vapoteur 7", "Coca Cola", "coca.jpg", 1.5));
        articlesList.add(new Articles(8, "Vapoteur 8", "Coca Cola", "coca.jpg", 1.5));
        articlesList.add(new Articles(9, "Vapoteur 9", "Coca Cola", "coca.jpg", 1.5));
        articlesList.add(new Articles(10, "Vapoteur 10", "Coca Cola", "coca.jpg", 1.5));

        return articlesList;


    }




}