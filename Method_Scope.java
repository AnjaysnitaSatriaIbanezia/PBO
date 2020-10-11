package com.company;

public class Method_Scope {
    public static void main(String[] args) {

        // Code here cannot use x

        int x = 100;

        // Code here can use x
        System.out.println(x);
    }
}
