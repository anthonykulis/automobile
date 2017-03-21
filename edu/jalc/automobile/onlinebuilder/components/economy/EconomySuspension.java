package edu.jalc.automobile.onlinebuilder.components.economy;

import edu.jalc.automobile.parts.*;

public class EconomySuspension extends Economy{

   private Shock shock;
   private Spring spring;
   
   private Economy(){
      this.shock = null;
      this.spring = null;
   }
   
   public Economy(Shock shock, Spring spring){
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
      return shock.toString() + ", " + spring.toString();
   }
   
}