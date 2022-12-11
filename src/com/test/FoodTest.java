package com.test;
import static org.junit.jupiter.api.Assertions.*;
import com.food.Food;
import org.junit.jupiter.api.Test;

class FoodTest {

    @Test
    void testFoodName() {
        Food food = new Food("Banana");
        assertEquals("Banana", food.getName());
    }

}