package com.company;

public class AMethodWith_IfElse {

    // Create a checkAge() method with an Integer variable called age
    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access Denied - You are not old enough!");
            // If age is greater than 18, print "access granted"
        } else {
            System.out.println("Access Granted - You are old enough!");
        }

    }

    public static void main(String[] args) {
        checkAge(20); // Call the checkAge method and pass along an age of 20
    }
}

// Outputs "Access Granted - You are old enough!