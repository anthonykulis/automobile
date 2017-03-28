package edu.jalc.automobile.onlinebuilder.components.suspension.sport;

import edu.jalc.automobile.parts.suspension.Shock;
import edu.jalc.automobile.parts.suspension.ShortSpring;
import edu.jalc.automobile.parts.suspension.Spring;


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
      return "sport has :" + "\n \t" + spring.toString() + "\n\t" + shock.toString();
   }
}
