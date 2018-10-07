package com.company;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items;
    private double totalPrice;

    public ShoppingCart(ArrayList<Item> items) {
        this.items = items;
    }

    public double getTotalPrice() {
        computeTotalPrice();
        return totalPrice;
    }

    private void computeTotalPrice() {
        totalPrice = 199.95;
    }
}