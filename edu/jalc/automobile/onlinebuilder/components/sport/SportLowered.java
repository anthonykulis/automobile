package edu.jalc.automobile.onlinebuilder.components.sport;

import edu.jalc.automobile.parts.*;

public class SportLowered extends Sport{

   static ShortSpring shortSpring;
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
      return "sport has :" + "\n \t" + shortSpring.toString() + " \n " + shortSpring.toString();
   }
}
