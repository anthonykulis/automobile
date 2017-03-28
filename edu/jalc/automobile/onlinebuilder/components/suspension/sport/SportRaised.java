package edu.jalc.automobile.onlinebuilder.components.suspension.sport;

import edu.jalc.automobile.parts.suspension.Shock;
import edu.jalc.automobile.parts.suspension.Spring;

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
<<<<<<< HEAD:edu/jalc/automobile/onlinebuilder/components/sport/SportRaised.java
      return "sport has :" + "\n \t" + spring.toString() + "\n\t" + shock.toString();
   }
=======
      return "SportRaised has :\n" +
                    "\t"+ shock+"\n"+
                    "\t"+ spring;
      
         }
>>>>>>> 1d77634c1647631ea22843a0da0953fc4fbd8d6c:edu/jalc/automobile/onlinebuilder/components/suspension/sport/SportRaised.java
}
