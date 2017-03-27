package edu.jalc.automobile.onlinebuilder.components.suspension.sport;

import edu.jalc.automobile.parts.suspension.*;

public class SportRaised extends Sport{

   private ExtendedShocks extendedShocks;
   private ExtendedSpring extendedSpring;
   private ForgedWheel forgedWheel;
   private SportTire sportTire;

   private SportRaised(){
      this.extendedShocks = null;
      this.extendedSpring = null;
      this.forgedWheel = null;
      this.sportTire = null;
   }

   public SportRaised(ExtendedShocks shock, ExtendedSpring spring, SportTire sportTire, ForgedWheel forgedWheel){
      this.extendedShocks = shock;
      this.extendedSpring = spring;
      this.sportTire = sportTire;
      this.forgedWheel = forgedWheel;
   }

   public Shock getShock(){
      return extendedShocks;
   }

   public Spring getSpring(){
      return extendedSpring;
   }

   public Tire getTire(){
      return sportTire;
   }

   public ForgedWheel getForgedWheel() {
      return forgedWheel;
   }

   public String toString(){
      return "SportRaised has :\n" +
                    "\t"+ extendedShocks.toString()+"\n"+
                    "\t"+ extendedSpring.toString()+"\n"+
                     "\t"+ sportTire.toString()+"\n"+
                     "\t"+ forgedWheel.toString()+"\n";

         }
}
