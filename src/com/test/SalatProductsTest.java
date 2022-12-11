package com.test;

import com.salat.SalatProducts;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalatProductsTest {
    SalatProducts test;

    SalatProductsTest(){
        test = new SalatProducts();
        test.setDefaultValues("Test", 1.1,1.27);
    }

    @Test
    void getName() {
        assertEquals("Test", test.getName());
    }

    @Test
    void getMass() {
        assertEquals(1.1, test.getMass());
    }

    @Test
    void getCalorie() {
        assertEquals(1.27, test.getCalorie());
    }

    @Test
    void testToString() {
        assertEquals("\t\t-Test (1,100kg, 1,3kcal)\n",test.toString());
    }
}