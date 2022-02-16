package com.company.HW4Method;

import java.util.Scanner;

public class Random {

    public static void main(String[] args) {
        Random();
    }
    public static void Random()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Start number of the range");
        int start = scanner.nextInt();
        System.out.print("Ending number of the range");
        int end = scanner.nextInt();
        int random = start + (int)(Math.random() * (double)(end - start + 1));
        System.out.println("random: " + random);
    }
}

