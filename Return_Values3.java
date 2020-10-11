package com.company;

public class Return_Values3 {

    static int myMethod(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int z = myMethod(5, 3);
        System.out.println(z);
    }
}
// Outputs 8 (5 + 3)