//package com.example.eVapoteurs.managedbean;
//
//
//import jakarta.annotation.PostConstruct;
//import jakarta.faces.view.ViewScoped;
//import jakarta.inject.Named;
//import lombok.Getter;
//import lombok.Setter;
//import org.itcentrex.com.application.model.CompteFidelite;
//import org.itcentrex.com.application.model.TransactionFidelite;
//import org.itcentrex.com.application.service.CompteFideliteService;
//import org.itcentrex.com.application.service.TransactionFideliteService;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//@Getter
//@Setter
//@Named
//@ViewScoped
//public class compteFideliteMB {
//
//    @Autowired
//    private CompteFideliteService compteFideliteService;
//    @Autowired
//    private TransactionFideliteService transactionFideliteService;
//
//    private List<CompteFidelite> compteFideliteList;
//    private CompteFidelite compteFidelite;
//    private TransactionFidelite transactionFidelite;
//    private List<TransactionFidelite> transactionFideliteList;
//
//    @PostConstruct
//    public void init() {
//        compteFideliteList = new ArrayList<>();
//        transactionFideliteList = new ArrayList<>();
//        transactionFideliteList = transactionFideliteService.listTransactions();
//
//        compteFideliteService = new CompteFideliteService();
//        compteFideliteList = compteFideliteService.getAllCompteFidelites();
//    }
//
//    public List<CompteFidelite> getAllCompteFidelites(int size) {
//        if (size > compteFideliteList.size()) {
//            Random rand = new Random();
//            List<CompteFidelite> randomList = new ArrayList<>();
//            for (int i = 0; i < size; i++) {
//                int randomIndex = rand.nextInt(compteFideliteList.size());
//                randomList.add(compteFideliteList.get(randomIndex));
//            }
//            return randomList;
//        } else {
//            return new ArrayList<>(compteFideliteList.subList(0, size));
//        }
//    }
//
//
//}
//
