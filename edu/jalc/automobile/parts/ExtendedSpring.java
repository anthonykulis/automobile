package edu.jalc.automobile.parts;

public class ExtendedSpring extends Spring{

     private double height = 10;

     ShortSpring(double height) {
       this.height = height;
     }


     public double getHeight(){
        return height;
     }

     public String toString(){
        return height + " inch Coil Spring";
     }
  }
