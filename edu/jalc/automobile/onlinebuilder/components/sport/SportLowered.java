package edu.jalc.automobile.onlinebuilder.components.sport;

import edu.jalc.automobile.parts.*;

public class SportLowered extends Sport{

   private Shock shock;
   private Spring spring;

   private SportLowered(){
      this.shock = null;
      this.spring = null;
   }

   public SportLowered(Shock shock, Spring spring){
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
      return "sport has :" + "\n \t" + ShortSpring.toString() + " \n " + ShortShocks.toString();
   }
}
