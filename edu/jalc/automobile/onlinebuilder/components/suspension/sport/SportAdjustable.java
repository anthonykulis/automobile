package edu.jalc.automobile.onlinebuilder.components.suspension.sport;

import edu.jalc.automobile.parts.suspension.*;

public class SportAdjustable extends Sport{
   
   private MediumSpring mediumSpring;
   private AdjustableShocks adjustableShocks;
   private SportTire sportTire;
   private ForgedWheel forgedWheel;

   private SportAdjustable(){
      this.adjustableShocks = null;
      this.mediumSpring = null;
      this.sportTire = null;
      this.forgedWheel = null;
   }

   public SportAdjustable(AdjustableShocks shock, MediumSpring spring, SportTire sportTire, ForgedWheel forgedWheel){
      this.adjustableShocks = shock;
      this.mediumSpring = spring;
      this.sportTire = sportTire;
      this.forgedWheel = forgedWheel;
   }

   public ForgedWheel getForgedWheel() {
      return forgedWheel;
   }

   public Shock getShock(){
      return adjustableShocks;
   }

   public Spring getSpring(){
      return mediumSpring;
   }
   public SportTire getTire(){
      return sportTire;
   }

   public String toString(){
      return "SportAdjustable has : \n" +
              "\t"+ adjustableShocks.toString()+"\n"+
              "\t"+ mediumSpring.toString()+"\n"+
              "\t"+ sportTire.toString() +"\n" +
               "\t"+ forgedWheel.toString()+"\n";

   }
}
