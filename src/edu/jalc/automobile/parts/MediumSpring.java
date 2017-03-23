package edu.jalc.automobile.parts;

public class MediumSpring extends Spring{

  public MediumSpring(double height) {
    this.height = height;
  }

   private double height;

   public double getHeight(){
      return height;
   }

   public String toString(){
      return height+ " inch Coil Spring";
   }
}
