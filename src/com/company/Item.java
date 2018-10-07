package com.company;

public class Item {
    private String itemName;
    private double itemPrice;
    private double taxRate;
    private double taxAmount;
    private double totalPrice;

    public Item(String itemName, double itemPrice, double taxRate) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.taxRate = taxRate;
    }

    private void computeTotalPrice() {
        taxAmount = itemPrice * taxRate * 0.01;
        totalPrice = itemPrice + taxAmount;
        totalPrice = (double) Math.round(totalPrice * 100) / 100;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public double getTotalPrice() {
        computeTotalPrice();
        return totalPrice;
    }
}