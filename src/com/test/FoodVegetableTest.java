package com.test;
import com.food.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodVegetableTest {

    @Test
    void testGetName(){
        Food food = new Vegetable("Tomato", 12.5);
        assertEquals("Tomato", food.getName());
    }

    @Test
    void testGetCalorie() {
        Food food = new Vegetable("Tomato", 12.5);
        assertEquals(12.5, food.getCalorie());
    }

    @Test
    void testToString() {
        Food food = new Vegetable("Tomato", 12.5);
        assertEquals("\t\tVegetable: Tomato\n" +
                "\t\tCalorie: 12,5 kcal/100g\n" +
                "\t\tType: Vegetable\n\n", food.toString());
    }
}