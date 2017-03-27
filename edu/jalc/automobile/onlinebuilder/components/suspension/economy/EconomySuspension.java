package edu.jalc.automobile.onlinebuilder.components.suspension.economy;

import edu.jalc.automobile.parts.suspension.Shock;
import edu.jalc.automobile.parts.suspension.Spring;
<<<<<<< HEAD
import edu.jalc.automobile.parts.suspension.Tire;
=======
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965

public class EconomySuspension extends Economy{

   private Shock stockShock;
   private Spring stockSpring;
<<<<<<< HEAD
   private Tire stockTire;
=======
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965
   
   private EconomySuspension(){
      this.stockShock = null;
      this.stockSpring = null;
<<<<<<< HEAD
      this.stockTire = null;
   }
   
   public EconomySuspension(Shock stockShock, Spring stockSpring,Tire stockTire){
      this.stockShock = stockShock;
      this.stockSpring = stockSpring;
      this.stockTire = stockTire;
=======
   }
   
   public EconomySuspension(Shock stockShock, Spring stockSpring){
      this.stockShock = stockShock;
      this.stockSpring = stockSpring;
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965
   }
   
   public Shock getShock(){
      return stockShock;
   }
   
   public Spring getSpring(){
      return stockSpring;
   }
<<<<<<< HEAD

   public Tire getTire() {
      return stockTire;
   }

   public String toString(){
      return "EconomySuspension has :\n" +
              "\t"+ stockShock.toString()+"\n"+
              "\t"+ stockSpring.toString()+"\n"+
              "\t"+ stockTire.toString();
=======
   
   public String toString(){
      return "EconomySuspension has :\n" +
                    "\t"+ stockShock+"\n"+
                    "\t"+ stockSpring;
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965
   }
   
}