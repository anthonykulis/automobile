package edu.jalc.automobile.onlinebuilder.components.suspension.sport;

import edu.jalc.automobile.parts.suspension.*;


public class SportLowered extends Sport{

   private ShortSpring shortSpring;
   private ShortShocks shortShocks;
   private SportTire sportTire;
   private ForgedWheel forgedWheel;

   private SportLowered(){
      this.shortShocks = null;
      this.shortSpring = null;
      this.sportTire = null;
      this.forgedWheel = null;
   }

   public SportLowered(ShortShocks shock, ShortSpring spring, SportTire sportTire, ForgedWheel forgedWheel){
      this.shortShocks = shock;
      this.shortSpring = spring;
      this.sportTire = sportTire;
      this.forgedWheel = forgedWheel;
   }

   public Shock getShock(){
      return shortShocks;
   }

   public Spring getSpring(){
      return shortSpring;
   }

   public SportTire getTire(){
      return sportTire;
   }

   public ForgedWheel getForgedWheel() {
      return forgedWheel;
   }

   public String toString(){
      return "SportLowered has : \n" +
              "\t"+ shortShocks.toString()+"\n"+
              "\t"+ shortSpring.toString()+"\n"+
              "\t"+ sportTire.toString() +"\n"+
              "\t"+ forgedWheel.toString()+"\n";
   }
}
