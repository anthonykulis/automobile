package edu.jalc.automobile.onlinebuilder.components.suspension.economy;

import edu.jalc.automobile.parts.suspension.Shock;
import edu.jalc.automobile.parts.suspension.Spring;

public class EconomySuspension extends Economy{

   private Shock stockShock;
   private Spring stockSpring;
   
   private EconomySuspension(){
      this.stockShock = null;
      this.stockSpring = null;
   }
   
   public EconomySuspension(Shock stockShock, Spring stockSpring){
      this.stockShock = stockShock;
      this.stockSpring = stockSpring;
   }
   
   public Shock getShock(){
      return stockShock;
   }
   
   public Spring getSpring(){
      return stockSpring;
   }
   
   public String toString(){
      return "EconomySuspension has :\n" +
                    "\t"+ stockShock+"\n"+
                    "\t"+ stockSpring;
   }
   
}