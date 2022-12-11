package com.test;
import com.food.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodFruitTest {

    @Test
    void testGetName(){
        Food food = new Fruit("Banana", 0.3);
        assertNotEquals("Bnn",food.getName());
        assertEquals("Banana", food.getName());
    }

    @Test
    void testGetCalorie() {
        Food food = new Fruit("Banana", 0.3);
        assertEquals(0.3, food.getCalorie());
        assertNotEquals(0,food.getCalorie() );
    }

    @Test
    void testToString() {
        Food food = new Fruit("Banana", 0.3);
        assertEquals("\t\tFruit: Banana\n" +
                "\t\tCalorie: 0,3 kcal/100g\n" +
                "\t\tType: Fruit\n\n", food.toString());
    }
}