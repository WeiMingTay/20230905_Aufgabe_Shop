package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Erstelle eine Klasse ProductRepo, die eine Liste von Product-Objekten enthält.

    Schritt 1: Erstelle einen Record Product mit den benötigten Attributen.
    Schritt 2: Implementiere die ProductRepo-Klasse mit einer Liste zur Speicherung von Produkten.
    Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Produkten.
 */
public class Main {
    public static void main(String[] args) {

        // Instantiate a few product objects
        Product my1stProduct = new Product("P-0001", "Guitar", "Fender", "Telecaster");
        Product my2ndProduct = new Product("P-0002", "Violin", "Stradivari", "Antonio");
        //

        // Instantiate a new ProductRepo
        ProductRepo myProductRepo = new ProductRepo();

        // Instrument zum ProductRepo hinzufügen
        myProductRepo.addProduct(my1stProduct);

        // Instrument vom ProductRepo entfernen
        // myProductRepo.removeProduct("P-0001");

        // Show the ProductRepo's product contents
        System.out.println(myProductRepo.products);
        myProductRepo.checkProduct("P-0001");

        // Create an order object
        List<Product> productsToBeOrdered = new ArrayList<>();
        productsToBeOrdered.add(my1stProduct);
        productsToBeOrdered.add(my2ndProduct);

        // myList mit Produkten erzeugen
        Order myFirstOrder = new Order("O-0001", productsToBeOrdered);
        System.out.println(myFirstOrder);

        // Instantiate an OrderListRepo object
        OrderListRepo myOrderListRepo = new OrderListRepo();
        // Register a first Order
        myOrderListRepo.addOrder(myFirstOrder);
        System.out.println(myOrderListRepo);




    }
}