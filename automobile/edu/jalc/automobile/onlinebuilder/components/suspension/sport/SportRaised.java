package edu.jalc.automobile.onlinebuilder.components.suspension.sport;

import edu.jalc.automobile.parts.suspension.Shock;
import edu.jalc.automobile.parts.suspension.Spring;
import edu.jalc.automobile.parts.suspension.Tire;

public class SportRaised extends Sport{

   private Shock shock;
   private Spring spring;
   private Tire tire;

   private SportRaised(){
      this.shock = null;
      this.spring = null;
      this.tire = null;
   }

   public SportRaised(Shock shock, Spring spring,Tire tire){
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
      return "SportRaised has :\n" +
                    "\t"+ shock.toString()+"\n"+
                    "\t"+ spring.toString()+"\n"+
                     "\t"+ tire.toString();
      
         }
}
