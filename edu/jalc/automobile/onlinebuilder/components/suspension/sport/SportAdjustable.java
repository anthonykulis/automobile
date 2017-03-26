package edu.jalc.automobile.onlinebuilder.components.suspension.sport;

import edu.jalc.automobile.parts.suspension.AdjustableShocks;
import edu.jalc.automobile.parts.suspension.MediumSpring;
import edu.jalc.automobile.parts.suspension.Shock;
import edu.jalc.automobile.parts.suspension.Spring;

public class SportAdjustable extends Sport{
   
   static MediumSpring mediumSpring;
   static AdjustableShocks adjustableShocks;
   private Shock shock;
   private Spring spring;

   private SportAdjustable(){
      this.shock = null;
      this.spring = null;
   }

   public SportAdjustable(Shock shock, Spring spring){
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
      return "sport has :" + "\n \t" + mediumSpring.toString() + " \n " + adjustableShocks.toString();
   }

}
