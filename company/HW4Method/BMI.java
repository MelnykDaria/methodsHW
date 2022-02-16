package com.company.HW4Method;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        BMI();
    }
    public static void BMI()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input weight in pounds: ");
        double pounds = scanner.nextDouble();
        System.out.println("Input weight in inchs: ");
        double inches = scanner.nextDouble();
        double kg = pounds * 0.453592D;
        double m = inches * 2.54D / 100.0D;
        double BMI = kg / (m * m);
        System.out.println("BMI is: " + BMI);
    }
}

