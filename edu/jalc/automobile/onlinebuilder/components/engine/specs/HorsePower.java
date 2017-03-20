package edu.jalc.automobile.onlinebuilder.components.engine.specs;
public class HorsePower{

   private double horsepower;
   private double rpm;

   private HorsePower(){
      this.horsepower = this.rpm = 0;
   }

   private HorsePower(double horsepower, double rpm){
      this.horsepower = horsepower;
      this.rpm = rpm;
   }

   public double getHorsepower(){
      return this.horsepower;
   }
   public double getRPM(){
      return this.rpm;
   }
}
