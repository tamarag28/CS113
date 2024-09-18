//**********************************************************
// File Name: NameApp.java
// Author: Tamara Gagic
// Purpose: Prompts for and reads the user's first and last 
// names and displays users initials and average length of 
// their first and last names.
// **********************************************************

import java.util.Scanner;

public class NameApp {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name:");
        String lastName = scan.nextLine();

        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);

        int firstNameLength = firstName.length();
        int lastNameLength = lastName.length();

        double averageNameLength = ((double)firstNameLength + (double)lastNameLength) / 2;

        System.out.println("Initials: " + firstInitial + lastInitial);
        System.out.println("Average length of name: " + averageNameLength);
    }
}

/* OPTOMIZED AI SOLUTION
import java.util.Scanner;

public class NameApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first and last name:");
        String firstName = scan.next(), lastName = scan.next();
        System.out.println("Initials: " + firstName.charAt(0) + lastName.charAt(0));
        System.out.println("Average length of name: " + (firstName.length() + lastName.length()) / 2.0);
    }
}
*/