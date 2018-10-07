package com.company;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShoppingCartTest {

    @Test
    public void shouldShowTotalPriceWhenFiveDoveItemsAreAddedtoShoppingCart() throws Exception {
        Item item = new Item("DOVE", 39.99, 0);

        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
        items.add(item);
        items.add(item);
        items.add(item);
        items.add(item);

        ShoppingCart shoppingCart = new ShoppingCart(items);

        assertEquals(199.95, shoppingCart.getTotalPrice(), 0.01);
    }

    @Test
    public void shouldShowTotalPriceWhen8DoveSoapItemsAreAddedtoShoppingCart() throws Exception {
        Item item = new Item("DOVE", 39.99, 0);

        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
        items.add(item);
        items.add(item);
        items.add(item);
        items.add(item);
        items.add(item);
        items.add(item);
        items.add(item);

        ShoppingCart shoppingCart = new ShoppingCart(items);

        assertEquals(319.92, shoppingCart.getTotalPrice(), 0.01);
    }
}