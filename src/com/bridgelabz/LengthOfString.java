package com.bridgelabz;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a FirstName ");
        firstName = scanner.nextLine();
        System.out.print("Enter a LastName ");
        lastName = scanner.nextLine();

        String fullName = firstName + "\t" + lastName;
        System.out.println("FinalString =>"+fullName);
        System.out.println(firstName.length()+lastName.length());


    }
}
