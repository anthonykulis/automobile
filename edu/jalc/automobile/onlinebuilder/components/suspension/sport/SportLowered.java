package edu.jalc.automobile.onlinebuilder.components.suspension.sport;

import edu.jalc.automobile.parts.suspension.Shock;
import edu.jalc.automobile.parts.suspension.ShortSpring;
import edu.jalc.automobile.parts.suspension.Spring;
import edu.jalc.automobile.parts.suspension.Tire;


public class SportLowered extends Sport{

   static ShortSpring shortSpring;
   private Shock shock;
   private Spring spring;
   private Tire tire;

   private SportLowered(){
      this.shock = null;
      this.spring = null;
      this.tire = null;
   }

   public SportLowered(Shock shock, Spring spring,Tire tire){
      this.shock = shock;
      this.spring = spring;
      this.tire = tire;
   }

   public Shock getShock(){
      return shock;
   }

   public Spring getSpring(){
      return spring;
   }

   public Tire getTire(){
      return tire;
   }

   public String toString(){
      return "sport has :" +
              "\t"+ shock.toString()+"\n"+
              "\t"+ spring.toString()+"\n"+
              "\t"+ tire.toString();
   }
}
