package edu.jalc.automobile.onlinebuilder.components.suspension.towing;


import edu.jalc.automobile.parts.suspension.*;


public class TowingHeavyDuty extends Towing{

   private HeavyShock shock;
   private HeavySpring spring;
   private AllTerrainTire tire;
   private SteelWheel steelWheel;

   private TowingHeavyDuty(){
      this.shock = null;
      this.spring = null;
      this.tire = null;
      this.steelWheel = null;
   }

  public TowingHeavyDuty(HeavyShock shock, HeavySpring spring, AllTerrainTire tire,SteelWheel steelWheel){

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

   public AllTerrainTire getTire() {
      return tire;
   }

   public SteelWheel getWheel() {
      return steelWheel;
   }

   public String toString(){
      return "Towing Heavy Duty has:\n" +
             "\t" + shock.toString() + "\n" +
             "\t" + spring.toString() + "\n" +
              "\t" + tire.toString() + "\n" +
              "\t" + steelWheel.toString() + "\n";
   }

}
