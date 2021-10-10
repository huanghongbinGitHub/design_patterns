package com.sh;

public class Demo {

    private static final String  colors[] = {"Red","Green","White","Black"};

    public static void main(String[] args) {

        for (int i = 0; i < 20;i++){
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.draw();
            System.out.println(circle);
        }

    }

    public static String getRandomColor(){
        System.out.println((int) (Math.random() * colors.length));
       return colors[(int) (Math.random() * colors.length)];
    }


}
