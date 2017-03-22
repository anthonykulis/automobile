package edu.jalc.automobile.onlinebuilder.components.economy;

import edu.jalc.automobile.parts.*;

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
      return stockShock.toString() + ", " + stockSpring.toString();
   }
   
}