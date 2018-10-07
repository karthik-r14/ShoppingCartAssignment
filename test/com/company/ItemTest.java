package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void shouldReturnItemNameWhenGetItemNameMethodIsInvoked() throws Exception {
        Item item = new Item("DOVE", 39.99, 12.5);

        assertEquals("DOVE", item.getItemName());
    }

    @Test
    public void shouldReturnItemPriceWhenGetItemPriceIsInvoked() throws Exception {
        Item item = new Item("DOVE", 39.99, 12.5);

        assertEquals(39.99, item.getItemPrice(), 0.01);
    }

    @Test
    public void shouldReturnTotalPriceWhenGetTotalPriceIsInvoked() throws Exception {
        Item item = new Item("DOVE", 39.99, 12.5);

        assertEquals(44.99, item.getTotalPrice(), 0.01);
    }

    @Test
    public void shouldReturnTaxAmountWhenGetTaxAmountIsInvoked() throws Exception {
        Item item = new Item("DOVE", 39.99, 12.5);

        assertEquals(5, item.getTaxAmount(), 0.01);
    }
}