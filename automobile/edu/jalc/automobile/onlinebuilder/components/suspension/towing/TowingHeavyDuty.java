package edu.jalc.automobile.onlinebuilder.components.suspension.towing;

import edu.jalc.automobile.parts.suspension.Shock;
import edu.jalc.automobile.parts.suspension.Spring;
import edu.jalc.automobile.parts.suspension.Tire;

public class TowingHeavyDuty extends Towing{

   private Shock shock;
   private Spring spring;
   private Tire tire;
   
   private TowingHeavyDuty(){
      this.shock = null;
      this.spring = null;
      this.tire = null;
   }
   
   public TowingHeavyDuty(Shock shock, Spring spring,Tire tire){
      this.shock = shock;
      this.spring = spring;
      this.tire = tire;
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

   public String toString(){
      return "Towing Heavy Duty has:\n" +
             "\t" + shock.toString() + "\n" +
             "\t" + spring.toString();
   }
   
}