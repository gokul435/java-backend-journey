package org.example.week2;

public class Circle extends Shape{

    double rad;

    public Circle(double rad){
        this.rad = rad;
    }
    @Override
    double calculateArea() {
        return ((Math.PI)*rad*rad);
    }
}
