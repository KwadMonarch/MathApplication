package com.pluralsight;

public class Mathapp {
    public static void main(String[] args) {
        int bobSalary = 600;
        int garySalary = 300;
        int highestSalary = Math.max(bobSalary, garySalary);
         System.out.println("The highest Salary is " + highestSalary);

        /**
         * 2. Find and display the smallest of two variables named CarPrice and TruckPrice. Set thr Variables to any value we want
         */

        double carPrice, truckPrice;

        truckPrice = 50000;
        carPrice = 35000;

         System.out.println("Minimum car price: " + Math.min(carPrice, truckPrice));

        /**
         * 3 find and displaay the area of a circle whose radius is 7.25
         */

        double radius = 7.25;
        double areaOfCircle = Math.PI * Math.pow(radius, 2);

        System.out.println("Area of a circle with radius " + radius); System.out.print("is " +  areaOfCircle);

    }
}
