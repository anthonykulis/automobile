package edu.jalc.automobile.onlinebuilder.components.suspension.towing;

import edu.jalc.automobile.parts.suspension.Shock;
import edu.jalc.automobile.parts.suspension.Spring;
import edu.jalc.automobile.parts.suspension.HeavyShock;
import edu.jalc.automobile.parts.suspension.HeavySpring; 

public class TowingHeavyDuty extends Towing{

   private HeavyShock shock;
   private HeavySpring spring;
   
   private TowingHeavyDuty(){
      this.shock = null;
      this.spring = null;
   }
   
   public TowingHeavyDuty(HeavyShock shock, HeavySpring spring){
      this.shock = shock;
      this.spring = spring;
   }
   
   public Shock getShock(){
      return shock;
   }
   
   public Spring getSpring(){
      return spring;
   }
   
   public String toString(){
      return "Towing Heavy Duty has:\n" +
             "\t" + shock.toString() + "\n" +
             "\t" + spring.toString();
   }
   
}