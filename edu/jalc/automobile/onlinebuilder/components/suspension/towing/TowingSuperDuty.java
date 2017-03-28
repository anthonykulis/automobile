package edu.jalc.automobile.onlinebuilder.components.suspension.towing;

import edu.jalc.automobile.parts.suspension.Shock;
import edu.jalc.automobile.parts.suspension.Spring;
import edu.jalc.automobile.parts.suspension.SuperShock;
import edu.jalc.automobile.parts.suspension.SuperSpring;

public class TowingSuperDuty extends Towing{

   private SuperShock shock;
   private SuperSpring spring;
   
   private TowingSuperDuty(){
      this.shock = null;
      this.spring = null;
   }
   
   public TowingSuperDuty(SuperShock shock, SuperSpring spring){
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