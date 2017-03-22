package edu.jalc.automobile.onlinebuilder.components.engine.specs;
public class Torque{

   private double torque;
   private double rpm;

   private Torque(){
      this.torque = this.rpm = 0;
   }

   public Torque(double torque, double rpm){
      this.torque = torque;
      this.rpm = rpm;
   }

   public double getTorque(){
      return this.torque;
   }
   public double getRPM(){
      return this.rpm;
   }
   
   public void setTorque(double torque){
     this.torque = torque;
   }
   public void setRPM(double rpm){
     this.rpm = rpm;
   }
}
