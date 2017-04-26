package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.suspension;

import edu.jalc.automobile.onlinebuilder.components.suspension.towing.Towing;
import edu.jalc.automobile.parts.suspension.Shock;
import edu.jalc.automobile.parts.suspension.Spring;
import edu.jalc.automobile.parts.suspension.HeavyShock;
import edu.jalc.automobile.parts.suspension.HeavySpring; 
import edu.jalc.automobile.parts.suspension.*;


public class TruckSuspension extends Towing{

   private Shock shock;
   private Spring spring;
   private Tire tire;
   private Wheel wheel;

   private TruckSuspension(){
      this.shock = null;
      this.spring = null;
      this.tire = null;
      this.wheel = null;
   }

  public TruckSuspension(Shock shock,Spring spring,Tire tire,Wheel wheel){

      this.shock = shock;
      this.spring = spring;
      this.tire = tire;
      this.wheel = wheel;
   }

   public Shock getShock(){
      return shock;
   }

   public Spring getSpring(){
      return spring;
   }

   public Tire getTire() {
      return tire;
   }

   public Wheel getWheel() {
      return wheel;
   }

   public String toString(){
      return "Truck Suspension has:\n" +
             "\t" + shock.toString() + "\n" +
             "\t" + spring.toString() + "\n" +
              "\t" + tire.toString() + "\n" +
              "\t" + wheel.toString() + "\n";
   }

}