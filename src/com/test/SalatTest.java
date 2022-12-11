package com.test;
import com.salat.Salat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SalatTest {

    private Salat salat;

    SalatTest(){
        salat = new Salat();
    }


    @Test
    void testToString() {
        assertEquals("\n" +
                "\tName: SalatTest\n" +
                "\tWeight: 4,500kg\n" +
                "\tCalories: 11,5kcal\n" +
                "\tFood in salat:\n" +
                "\t\t-Test1 (1,100kg, 1,3kcal)\n" +
                "\t\t-Test2 (2,400kg, 0,3kcal)\n" +
                "\t\t-Test3 (1,000kg, 10,0kcal)\n" +
                "\n", salat.toString());
    }

    @Test
    void testSortNames() {
        salat.bubbleSort(1);
        assertEquals("\n" +
                "\tName: SalatTest\n" +
                "\tWeight: 4,500kg\n" +
                "\tCalories: 11,5kcal\n" +
                "\tFood in salat:\n" +
                "\t\t-Test1 (1,100kg, 1,3kcal)\n" +
                "\t\t-Test2 (2,400kg, 0,3kcal)\n" +
                "\t\t-Test3 (1,000kg, 10,0kcal)\n" +
                "\n",salat.toString());
    }

    @Test
    void testSortMass() {
        salat.bubbleSort(2);
        assertEquals("\n" +
                "\tName: SalatTest\n" +
                "\tWeight: 4,500kg\n" +
                "\tCalories: 11,5kcal\n" +
                "\tFood in salat:\n" +
                "\t\t-Test3 (1,000kg, 10,0kcal)\n" +
                "\t\t-Test1 (1,100kg, 1,3kcal)\n" +
                "\t\t-Test2 (2,400kg, 0,3kcal)\n" +
                "\n",salat.toString());
    }

    @Test
    void testSortCalorie() {
        salat.bubbleSort(3);
        assertEquals("\n" +
                "\tName: SalatTest\n" +
                "\tWeight: 4,500kg\n" +
                "\tCalories: 11,5kcal\n" +
                "\tFood in salat:\n" +
                "\t\t-Test2 (2,400kg, 0,3kcal)\n" +
                "\t\t-Test1 (1,100kg, 1,3kcal)\n" +
                "\t\t-Test3 (1,000kg, 10,0kcal)\n" +
                "\n",salat.toString());
    }
}