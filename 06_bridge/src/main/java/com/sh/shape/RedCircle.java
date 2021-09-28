package com.sh.shape;

public class RedCircle implements DrawAPI {

   public void drawCircle(int radius, int x, int y) {
      System.out.println("Drawing com.sh.shape.Circle[ color: red, radius: "
         + radius +", x: " +x+", "+ y +"]");
   }
}