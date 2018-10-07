package com.company;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items;
    private double totalPrice;
    private double totalTax;

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

    public double getTotalTax() {
        for (Item item : items) {
            totalTax += item.getTaxAmount();
        }

        totalTax = (double) Math.round(totalTax * 100) / 100;

        return totalTax;
    }
}