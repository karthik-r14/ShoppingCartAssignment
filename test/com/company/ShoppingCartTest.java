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

    @Test
    public void shouldShowTotalPriceWhenTwoDoveSoapsAndTwoAxeDeoAreAddedToTheCart() throws Exception {
        Item dove = new Item("DOVE", 39.99, 12.5);
        Item axeDeo = new Item("AxeDeo", 99.99, 12.5);

        ArrayList<Item> items = new ArrayList<>();
        items.add(dove);
        items.add(dove);
        items.add(axeDeo);
        items.add(axeDeo);

        ShoppingCart shoppingCart = new ShoppingCart(items);

        assertEquals(314.96, shoppingCart.getTotalPrice(), 0.01);
        assertEquals(35, shoppingCart.getTotalTax(), 0.01);
    }
}