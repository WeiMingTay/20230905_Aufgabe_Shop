package org.example;

import java.util.List;


public class ShopService {



    //Schritt 1: Implementiere eine Methode, um eine neue Bestellung aufzugeben.
    public Order placeNewOrder(String orderId, List<Product> productsToBeOrdered) {
        // Ask for an orderId + a list of productsToBeOrdered, ...
        // ... actually 'package' those arguments into a final order, ...
        // ... and return it as a result
        return new Order(orderId, productsToBeOrdered);
        // additionally, register the resulting order within the OrderListRepo

    }

    //Schritt 2: Überprüfe, ob die bestellten Produkte existieren. Wenn nicht gebe ein System.out.println aus.

}
