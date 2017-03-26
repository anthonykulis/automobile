package edu.jalc.automobile.onlinebuilder.components.suspension.towing;

public class TowingHeavyDuty extends Towing{

   private Shock shock;
   private Spring spring;
   
   private TowingHeavyDuty(){
      this.shock = null;
      this.spring = null;
   }
   
   public TowingHeavyDuty(Shock shock, Spring spring){
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