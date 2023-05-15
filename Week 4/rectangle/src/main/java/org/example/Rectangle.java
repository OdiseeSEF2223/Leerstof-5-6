package org.example;

public class Rectangle {

    public double length;
    public double width;
    private double area;

    public Rectangle(final double length, final double width){
        this.width = width;
        this.length = length;
        area = length * width;
    }

    public double getArea(){
        return area;
    }
}
