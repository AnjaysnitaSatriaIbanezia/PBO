package com.company;

import java.util.*;

public class SistemLogIn {
    public static void main (String[] args){
        String id;
        String pass;
        int i = 0;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("Sistem Login");
        System.out.println("Silahkan masukkan :");

        do {
            i++;
            //Input Username
            System.out.print("Username :");
            id = inputUser.next();

            //Input Password
            System.out.print("Password :");
            pass = inputUser.next();

            //Compare String Username and Pass
            if(id.equals("UPJ")&&pass.equals("UPJ123")){

                System.out.println("Selamat Datang");
                return;
            } else{

                System.out.println("Username dan Password salah! Ini percobaan ke-"+i);
            }

        } while(i<4);
        System.out.println("Percobaan sudah mencapai batas maksimal yaitu 3x");
    }
}

