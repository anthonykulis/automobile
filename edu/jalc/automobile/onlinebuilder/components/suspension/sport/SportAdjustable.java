package edu.jalc.automobile.onlinebuilder.components.suspension.sport;

<<<<<<< HEAD:edu/jalc/automobile/onlinebuilder/components/suspension/sport/SportAdjustable.java
import edu.jalc.automobile.parts.suspension.*;
=======
import edu.jalc.automobile.parts.suspension.AdjustableShocks;
import edu.jalc.automobile.parts.suspension.MediumSpring;
import edu.jalc.automobile.parts.suspension.Shock;
import edu.jalc.automobile.parts.suspension.Spring;
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965:edu/jalc/automobile/onlinebuilder/components/suspension/sport/SportAdjustable.java

public class SportAdjustable extends Sport{
   
   static MediumSpring mediumSpring;
   static AdjustableShocks adjustableShocks;
   private Shock shock;
   private Spring spring;
   private Tire tire;

   private SportAdjustable(){
      this.shock = null;
      this.spring = null;
   }

   public SportAdjustable(Shock shock, Spring spring,Tire tire){
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
