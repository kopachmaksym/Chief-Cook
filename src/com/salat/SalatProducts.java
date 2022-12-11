package com.salat;

import java.util.Scanner;

public class SalatProducts {
    Scanner scanner = new Scanner(System.in);
    String name;
    double mass;
    double calorie;

    public SalatProducts(){
    }

    SalatProducts(String name, double calorie_or){
        this.name = name;
        System.out.print("\nEnter the weight of the " + name + ": ");
        double ms = scanner.nextFloat();
        mass = ms;
        calorie = calorie_or*(ms*10);
    }

    public String getName(){
        return name;
    }

    public double getMass(){
        return mass;
    }

    public double getCalorie(){
        return calorie;
    }

    public String toString(){
        return String.format("\t\t-%s (%.3fkg, %.1fkcal)\n",name, mass, calorie);
    }

    public void setDefaultValues(String name, double mass, double calorie){
        this.name = name;
        this.mass = mass;
        this.calorie = calorie;
    }

}
