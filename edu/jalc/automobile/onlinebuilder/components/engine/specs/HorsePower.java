package edu.jalc.automobile.onlinebuilder.components.engine.specs;
public class HorsePower{

   private double horsePower;
   private double rpm;

   private HorsePower(){
      this.horsePower = this.rpm = 0;
   }

   public HorsePower(double horsePower, double rpm){
      this.horsePower = horsePower;
      this.rpm = rpm;
   }

   public double getHorsePower(){
      return this.horsePower;
   }
   public double getRPM(){
      return this.rpm;
   }
   
   public void setHorsePower(double horsePower){
     this.horsePower = horsePower;
   }
   public void setRPM(double rpm){
     this.rpm = rpm;
   }
}
