package com.company.HW4Method;

import java.util.Scanner;

public class Speedtask {
    public static void main(String[] args) {
        Speed();
    }
    public static void Speed()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in meters: ");
        float distance = scanner.nextFloat();
        System.out.print("Enter hour: ");
        float hour = scanner.nextFloat();
        System.out.print("Enter minutes: ");
        float minute = scanner.nextFloat();
        System.out.print("Enter seconds: ");
        float second = scanner.nextFloat();
        float timeSeconds = hour * 3600.0F + minute * 60.0F + second;
        float mps = distance / timeSeconds;
        float kph = distance / 1000.0F / (timeSeconds / 3600.0F);
        System.out.println("Your speed in meters/second is " + mps);
        System.out.println("Your speed in km/h is " + kph);
    }
}

