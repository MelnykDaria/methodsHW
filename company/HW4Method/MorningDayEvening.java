package com.company.HW4Method;
import java.util.Scanner;
public class MorningDayEvening {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day time");
    int time = scanner.nextInt();
    checkDayOrMorningOrEvening(time);
}
    public static void checkDayOrMorningOrEvening(int time) {
        if (time > 18) {
            System.out.println("Good evening");
        } else if (time > 10) {
            System.out.println("Good morning");

        } else {
            System.out.println("Good day");
        }
    }
}

