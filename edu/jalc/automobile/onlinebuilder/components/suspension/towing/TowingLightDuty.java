package edu.jalc.automobile.onlinebuilder.components.suspension.towing;

import edu.jalc.automobile.parts.suspension.*;

public class TowingLightDuty extends Towing{

   private LightShock shock;
   private LightSpring spring;
   private Tire tire;
   private SteelWheel steelWheel;
   
   private TowingLightDuty(){
      this.shock = null;
      this.spring = null;
      this.tire = null;
      this.steelWheel = null;
   }
   
   public TowingLightDuty(LightShock shock, LightSpring spring, AllTerrainTire tire, SteelWheel steelWheel){
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

   public SteelWheel getWheel() {
      return steelWheel;
   }

   public String toString(){
      return "Towing Light Duty has:\n" +
             "\t" + shock.toString() + "\n" +
             "\t" + spring.toString() + "\n" +
              "\t" + tire.toString() + "\n" +
              "\t" + steelWheel.toString() + "\n";
   }
   
}