package edu.jalc.automobile.parts.engine;
import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;

import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

abstract public class Engine extends EngineAssembly{
   private double displacement;
   private HorsePower horsePower;
   private Torque torque;
   private int cylinders;

   private Engine(){
      this.displacement = this.cylinders = 0;
      this.horsePower = new HorsePower(0,0);
      this.torque = new Torque(0,0);
   }

   public Engine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
   this.displacement = displacement;
   this.horsePower = horsePower;
   this.torque = torque;
   this.cylinders = cylinders;
   }

   public String toString(){
     return String.format("%f %d cylinder",displacement,cylinders);
   }

   public double getDisplacement(){
      return this.displacement;
   }
   public int getCylinders(){
      return this.cylinders;
   }
   public HorsePower getHorsePower(){
      return this.horsePower;
   }
   public Torque getTorque(){
      return this.torque;
   }

   public void setDisplacement(double displacement){
     this.displacement = displacement;
   }
   public void setHorsePower(HorsePower horsePower){
     this.horsePower = horsePower;
   }
   public void setTorque(Torque torque){
     this.torque = torque;
   }
   public void setCylinders(int cylinders){
     this.cylinders = cylinders;
   }
}
