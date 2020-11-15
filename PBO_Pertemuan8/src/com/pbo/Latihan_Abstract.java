package com.pbo;

import java.util.*;

abstract class input1 {
    Scanner input= new Scanner(System.in);
    int alas = 0;
    int tinggi = 0;
    int diameter = 0;
    float phi = (float) 3.14;
    double hasilSegitiga;
    double hasilLingkaran;
    double diameter2;

    //abstract method
    public abstract void hasil();

    //regular method
    public void inputAlasTinggi() {
        System.out.print("masukkan alas: ");
        alas = input.nextInt();
        System.out.print("masukkan tinggi: ");
        tinggi = input.nextInt();
    }

    //regular method
    public void inputDiameter() {
        System.out.print("masukkan diameter: ");
        diameter = input.nextInt();
    }
}

//subclass
class LuasSegitiga extends input1{
    public void hasil() {
        hasilSegitiga = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga adalah 0.5 x " + alas + " x " + tinggi +  " = " + hasilSegitiga);
    }
}

//subclass
class LuasLingkaran extends input1{
    public void hasil() {
        diameter2 = diameter / 2;
        hasilLingkaran = phi * diameter2 * diameter2;
        System.out.println("Luas lingkaran adalah 3.14 x " + diameter2 + " x " + diameter2 + " = " + hasilLingkaran);
    }
}



public class Latihan_Abstract {
    public static void main(String[] args) {
        LuasSegitiga luass = new LuasSegitiga();
        LuasLingkaran luasl = new LuasLingkaran();
        luass.inputAlasTinggi();
        luass.hasil();
        System.out.println("===============================================");
        luasl.inputDiameter();
        luasl.hasil();
    }
}