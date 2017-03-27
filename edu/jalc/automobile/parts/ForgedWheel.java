package edu.jalc.automobile.parts;

public class ForgedWheel extends Wheel{

   private double size;
   private Tire tire;

   public ForgedWheel(double size, Tire tire) {
     this.size = size;
     this.tire = tire;
   }

   public double getSize(){
      return size;
   }
   
   public Tire getTire(){
      return tire;
   }

   public String toString(){
      return "Forged Wheels with " +getTire();
   }
}
