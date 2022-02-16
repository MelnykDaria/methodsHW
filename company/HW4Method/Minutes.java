package com.company.HW4Method;

import java.util.Scanner;

public class Minutes {
    public static void main(String[] args) {
        TotalMinutes();
    }

    public static void TotalMinutes()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total minutes");
        int minutes = scanner.nextInt();
        int days = minutes / 1440;
        int year = days / 365;
        int days2 = days % 365;
        System.out.println(year + " year " + days2 + " days ");
    }
}