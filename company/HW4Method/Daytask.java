package com.company.HW4Method;

import java.util.Scanner;

public class Daytask {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int weekday = scanner.nextInt();
    System.out.println("Enter weekday number ");
    DayName(weekday);
}

    public static void DayName(int weekday)
    {
        if (weekday == 1)
            System.out.println("Monday");

    }
}






