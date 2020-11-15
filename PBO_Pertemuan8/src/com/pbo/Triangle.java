package com.pbo;

public class Triangle extends Shape {
    private int base, height;

    public Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    public double getArea(){
        return 0.5*base*height;
    }
    public String toString(){
        return "Triangle";
    }
}
