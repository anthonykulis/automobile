package edu.jalc.automobile.onlinebuilder.components.suspension.towing;

public class TowingLightDuty extends Towing{

   private Shock shock;
   private Spring spring;
   
   private TowingLightDuty(){
      this.shock = null;
      this.spring = null;
   }
   
   public TowingLightDuty(Shock shock, Spring spring){
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
      return "Towing Light Duty has:\n" +
             "\t" + shock.toString() + "\n" +
             "\t" + spring.toString();
   }
   
}