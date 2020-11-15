package com.pbo;

public class Rectangle extends Shape{
    private int lenght, widht;

    public Rectangle(int lenght,int widht){
        this.lenght = lenght;
        this.widht = widht;
    }

    public double getArea(){
        return lenght*widht;
    }
    public String toString(){
        return "Rectangle";
    }
}