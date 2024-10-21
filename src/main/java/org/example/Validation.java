package org.example;

import java.util.Scanner;

public class Validation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();


        if (isValidFirstName(firstName)) {
            System.out.println("Valid first name.");
        } else {
            System.out.println("Invalid first name. It must start with a capital letter and have at least 3 characters.");
        }

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();


        if (isValidLastName(lastName)) {
            System.out.println("Valid last name.");
        } else {
            System.out.println("Invalid last name. It must start with a capital letter and have at least 3 characters.");
        }


        System.out.print("Enter your email: ");
        String email = scanner.nextLine();


        if (isValidEmail(email)) {
            System.out.println("Valid email.");
        } else {
            System.out.println("Invalid email. It must follow the format abc.xyz@bl.co.in.");
        }

        System.out.print("Enter your mobile number (e.g., 91 9919819801): ");
        String mobileNumber = scanner.nextLine();


        if (isValidMobileNumber(mobileNumber)) {
            System.out.println("Valid mobile number.");
        } else {
            System.out.println("Invalid mobile number. It must follow the format 91 9919819801.");
        }

        System.out.print("Enter your password (min 8 characters): ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid password.");
        } else {
            System.out.println("Invalid password. It must be at least 8 characters long.");
        }


        scanner.close();
    }


    public static boolean isValidFirstName(String firstName) {
        String regex = "^[A-Z][a-z]{2,}$";
        return firstName.matches(regex);
    }

    public static boolean isValidLastName(String lastName) {
        String regex = "^[A-Z][a-z]{2,}$";
        return lastName.matches(regex);
    }

    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        return email.matches(regex);
    }
    public static boolean isValidMobileNumber(String mobileNumber) {
        String regex = "^91\\s[0-9]{10}$";
        return mobileNumber.matches(regex);
    }

    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";
        return password.matches(regex);
    }

}
