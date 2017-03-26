package edu.jalc.automobile.parts.suspension;

public class ExtendedSpring extends Spring{

    public ExtendedSpring(double height) {
        this.height = height;
    }

     private double height = 10;

     public double getHeight(){
        return height;
     }

     public String toString(){
        return height + " inch Coil Spring";
     }
  }
