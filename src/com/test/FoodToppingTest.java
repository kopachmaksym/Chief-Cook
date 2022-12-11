package com.test;
import com.food.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodToppingTest {

    @Test
    void testGetName(){
        Food food = new Topping("Mayonesse", 35.5);
        assertEquals("Mayonesse", food.getName());
    }

    @Test
    void testGetCalorie() {
        Food food = new Topping("Mayonesse", 35.5);
        assertEquals(35.5, food.getCalorie());
    }

    @Test
    void testToString() {
        Food food = new Topping("Mayonesse", 35.5);
        assertEquals("\t\tTopping: Mayonesse\n" +
                "\t\tCalorie: 35,5 kcal/100g\n" +
                "\t\tType: Topping\n\n", food.toString());
    }
}