package com.sh;

public class Circle implements Shape {

    public Circle(String color) {
        this.color = color;
    }

    private String color;

    private int x;

    private int y;

    private int radius;

    public void setColor(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Circle :Draw() "+color + x + y + radius);
    }
}
