package org.example;

import java.util.ArrayList;
import java.util.List;

public record Order(String id, List<Product> products) {

  /*  public void addItems (List<Product> products) {

    }

    public void checkExistence (Product product) {

    }*/

}
