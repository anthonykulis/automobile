package edu.jalc.automobile.onlinebuilder.components.suspension.towing;


import edu.jalc.automobile.parts.suspension.Shock;
import edu.jalc.automobile.parts.suspension.Spring;
import edu.jalc.automobile.parts.suspension.SuperShock;
import edu.jalc.automobile.parts.suspension.SuperSpring;
import edu.jalc.automobile.parts.suspension.Tire;
import edu.jalc.automobile.parts.suspension.Wheel;



public class TowingSuperDuty extends Towing{

   private SuperShock shock;
   private SuperSpring spring;
   private Tire tire;
   private Wheel steelWheel;


   private TowingSuperDuty(){
      this.shock = null;
      this.spring = null;
      this.tire = null;
      this.steelWheel = null;
   }


   public TowingSuperDuty(SuperShock shock, SuperSpring spring, Tire tire, Wheel steelWheel){
      this.shock = shock;
      this.spring = spring;
      this.tire = tire;
      this.steelWheel = steelWheel;
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
      return steelWheel;
   }

   public String toString(){
      return "Towing Super Duty has:\n" +
             "\t" + shock.toString() + "\n" +
             "\t" + spring.toString() + "\n" +
              "\t" + tire.toString() + "\n" +
              "\t" + steelWheel.toString();
   }

}
