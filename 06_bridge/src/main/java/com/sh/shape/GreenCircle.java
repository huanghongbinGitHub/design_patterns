package com.sh.shape;

public class GreenCircle implements DrawAPI {

   public void drawCircle(int radius, int x, int y) {
      System.out.println("Drawing com.sh.shape.Circle[ color: green, radius: "
         + radius +", x: " +x+", "+ y +"]");
   }
}