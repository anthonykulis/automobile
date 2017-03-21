package edu.jalc.automobile.onlinebuilder.components.towing;

import edu.jalc.automobile.parts.*;

public class TowingSuperDuty extends Towing{

   private Shock shock;
   private Spring spring;
   
   private TowingSuperDuty(){
      this.shock = null;
      this.spring = null;
   }
   
   public TowingSuperDuty(Shock shock, Spring spring){
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
      return "Towing Super Duty has:\n" +
             "\t" + shock.toString() + "\n" +
             "\t" + spring.toString();
   }
   
}