package com.company.HW4Method;

import java.util.Scanner;

public class PasswordLogin {

    public static void main(String[] args) {
        NamePassword();
    }
    public static void NamePassword()
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = input.nextLine();
        System.out.println("Enter your password: ");
        String password = input.nextLine();

        if("Daria".equals(username) && "password".equals("password"))
        {

            System.out.print("Successfully logins");
        } else{
            System.out.println("Invalid password: ");

        }
    }
}

