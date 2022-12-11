package com.test;

import com.food.*;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class WholeFoodTest {

    private List<Food> foods = new ArrayList<>();
    private List<Food> test = new ArrayList<>();

    WholeFoodTest(){
        test.add(new Vegetable("Test", 0.1));
        foods.add(new Vegetable("Tomato",17.7));
        foods.add(new Vegetable("Onion",32.8));
    }

    @Test
    void testVegList() {

        assertNotEquals(WholeFood.VegList(test),WholeFood.VegList(foods));

//        assertSame("\n" +
//                "\t1.\n" +
//                "\t\tVegetable: Tomato\n" +
//                "\t\tCalorie: 17,7 kcal/100g\n" +
//                "\t\tType: Vegetable\n" +
//                "\n" +
//                "\n" +
//                "\n" +
//                "\t2.\n" +
//                "\t\tVegetable: Onion\n" +
//                "\t\tCalorie: 32,8 kcal/100g\n" +
//                "\t\tType: Vegetable\n" +
//                "\n" +
//                "\n",WholeFood.VegList(foods));

    }

    @Test
    void testAddFood() {
        foods.add(new Topping("SoySause",50.0));
        assertEquals("\n" +
                "\t1.\n" +
                "\t\tVegetable: Tomato\n" +
                "\t\tCalorie: 17,7 kcal/100g\n" +
                "\t\tType: Vegetable\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t2.\n" +
                "\t\tVegetable: Onion\n" +
                "\t\tCalorie: 32,8 kcal/100g\n" +
                "\t\tType: Vegetable\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t3.\n" +
                "\t\tTopping: SoySause\n" +
                "\t\tCalorie: 50,0 kcal/100g\n" +
                "\t\tType: Topping\n" +
                "\n" +
                "\n", WholeFood.VegList(foods));
    }

    void testRemoveFood(){

    }

}