package com.pluralsight;

public class Mathapp {
    public static void main(String[] args) {
        int bobSalary = 600;
        int garySalary = 300;
        int highestSalary = Math.max(bobSalary, garySalary);
         System.out.println(highestSalary);

        int carPrice = 1000;
        int truckPrice = 5000;
        int lowerPrice = Math.min(carPrice, truckPrice);
         System.out.println(lowerPrice);

        float circleRadius =7.25f;
        float circleArea = (3.14f) * circleRadius^2;
                System.out.println(circleArea);
    }
}
