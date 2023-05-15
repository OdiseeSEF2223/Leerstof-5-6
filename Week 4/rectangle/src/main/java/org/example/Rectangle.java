package org.example;

public class Rectangle {

    private double length;
    private double width;
    private double area;

    public Rectangle(final double length, final double width){
        this.width = width;
        this.length = length;
        area = length * width;
    }

    public void setLength(double length) {
        this.length = length;
        area = length * width;
    }

    public void setWidth(double width) {
        this.width = width;
        area = length * width;
    }

    public double getArea(){
        return area;
    }
}
