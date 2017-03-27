package edu.jalc.automobile.onlinebuilder.components.suspension.economy;

import edu.jalc.automobile.parts.suspension.Shock;
import edu.jalc.automobile.parts.suspension.Spring;
import edu.jalc.automobile.parts.suspension.Tire;

public class EconomySuspension extends Economy{

   private Shock stockShock;
   private Spring stockSpring;
   private Tire stockTire;
   
   private EconomySuspension(){
      this.stockShock = null;
      this.stockSpring = null;
      this.stockTire = null;
   }
   
   public EconomySuspension(Shock stockShock, Spring stockSpring,Tire stockTire){
      this.stockShock = stockShock;
      this.stockSpring = stockSpring;
      this.stockTire = stockTire;
   }
   
   public Shock getShock(){
      return stockShock;
   }
   
   public Spring getSpring(){
      return stockSpring;
   }

   public Tire getTire() {
      return stockTire;
   }

   public String toString(){
      return "EconomySuspension has :\n" +
              "\t"+ stockShock.toString()+"\n"+
              "\t"+ stockSpring.toString()+"\n"+
              "\t"+ stockTire.toString();
   }
   
}