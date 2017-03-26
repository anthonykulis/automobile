package edu.jalc.automobile.onlinebuilder.components.suspension.sport;

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
      return "SportRaised has :\n" +
                    "\t"+ shock+"\n"+
                    "\t"+ spring;
      
         }
}
