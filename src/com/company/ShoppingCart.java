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
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }

        totalPrice = (double) Math.round(totalPrice * 100) / 100;
    }
}