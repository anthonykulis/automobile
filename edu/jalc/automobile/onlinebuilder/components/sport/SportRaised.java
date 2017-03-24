package edu.jalc.automobile.onlinebuilder.components.sport;

import edu.jalc.automobile.parts.*;

public class SportRaised extends Sport{

   private Shock shock;
   private Spring spring;

   private SportRaised(){
      this.shock = null;
      this.spring = null;
   }

   public SportRaised(Shock shock, Spring spring){
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
      return "";
         }
}
