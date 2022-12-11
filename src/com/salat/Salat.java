package com.salat;
import com.food.Food;
import java.util.*;

public class Salat {
    private final Scanner scanner = new Scanner(System.in);
    private final String salat;
    private final List<SalatProducts> prod = new ArrayList<>();

    public Salat(){ //test constructor
        salat = "SalatTest";
        SalatProducts test = new SalatProducts();
        test.setDefaultValues("Test1", 1.1,1.27);
        prod.add(test);
        test = new SalatProducts();
        test.setDefaultValues("Test2",2.4,0.25);
        prod.add(test);
        test = new SalatProducts();
        test.setDefaultValues("Test3",1,10);
        prod.add(test);
    }

    public Salat(List<Food> select){
        /*
        Constructor
         */
        scanner.useLocale(Locale.US);
        System.out.print("Insert the name of the salat: ");
        salat = scanner.next();
        for (int i=0;i<select.size();i++){
            prod.add(new SalatProducts(select.get(i).getName(), select.get(i).getCalorie()));
        }
    }

    public void calRange(){
        /*
        Finding food with needed calories from salat
         */
        int j=1;
        double more, less;
        System.out.print("\tEnter the range:\n\t\tMore: ");
        more = scanner.nextFloat();
        System.out.print("\t\tLess: ");
        less = scanner.nextFloat();
        System.out.printf("%s's food in range > %.1f and < %.1f%n",salat,more,less);
        for (int i=0;i<prod.size();i++){
            if(prod.get(i).getCalorie()>more && prod.get(i).getCalorie()< less){
                System.out.printf("\t\t%d. %s - %.1fkcal%n",j,prod.get(i).getName(),prod.get(i).getCalorie());
                j++;
            }
        }
    }

    public String toString(){

        /*
        Method of returning salat's data
         */

        double ms = 0, cl = 0;
        String text = String.format("\n\tName: %s\n",salat);
        String add ="\n\tFood in salat:\n";
        for (int i =0;i<prod.size();i++){
            ms += prod.get(i).getMass();
            cl += prod.get(i).getCalorie();
            add += prod.get(i).toString();
        }
        text += String.format("\tWeight: %.3fkg\n\tCalories: %.1fkcal",ms,cl);
        text += add;
        text += "\n";
        return text;
    }

    public void bubbleSort(int var){
        /*
        Sorting methods
         */

        switch (var){
            case (1):
                Collections.sort(prod, new NameComparator());
                return;
            case (2):
                Collections.sort(prod, new MassComparator());
                return;
            case (3):
                Collections.sort(prod, new CalorieComparator());
                return;
        }

    }

}

class NameComparator implements Comparator<SalatProducts> {
    @Override
    public int compare(SalatProducts a, SalatProducts b) {
        return a.name.compareToIgnoreCase(b.name);
    }
}

class CalorieComparator implements Comparator<SalatProducts> {
    @Override
    public int compare(SalatProducts a, SalatProducts b) {
        return a.calorie < b.calorie ? -1 : a.calorie == b.calorie ? 0 : 1;
    }
}

class MassComparator implements Comparator<SalatProducts> {
    @Override
    public int compare(SalatProducts a, SalatProducts b) {
        return a.mass < b.mass ? -1 : a.mass == b.mass ? 0 : 1;
    }
}