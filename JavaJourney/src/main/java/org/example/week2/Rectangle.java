package org.example.week2;

public class Rectangle extends Shape{

    double length;
    double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    double calculateArea() {
        return length * width ;
    }

}
