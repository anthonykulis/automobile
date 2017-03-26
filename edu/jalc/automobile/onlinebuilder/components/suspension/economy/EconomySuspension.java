package edu.jalc.automobile.onlinebuilder.components.suspension.economy;
import edu.jalc.automobile.parts.suspension.*;

public class EconomySuspension extends Economy{

   private jalc.automobile.parts.suspension.Shock stockShock;
   private Spring stockSpring;
   
   private EconomySuspension(){
      this.stockShock = null;
      this.stockSpring = null;
   }
   
   public EconomySuspension(jalc.automobile.parts.suspension.Shock stockShock, Spring stockSpring){
      this.stockShock = stockShock;
      this.stockSpring = stockSpring;
   }
   
   public jalc.automobile.parts.suspension.Shock getShock(){
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