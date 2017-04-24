package edu.jalc.automobile.onlinebuilder.components.suspension.economy;

import edu.jalc.automobile.parts.suspension.*;

public class EconomySuspension extends Economy{

   private StockShock stockShock;
   private StockSpring stockSpring;
   private Tire stockTire;
   private Wheel wheel;

   private EconomySuspension(){
      this.stockShock = null;
      this.stockSpring = null;
      this.stockTire = null;
      this.wheel = null;
   }

   public EconomySuspension(StockShock stockShock, StockSpring spring,EconomyTire tire,AlloyWheel wheel){
      this.stockShock = stockShock;
      this.stockSpring = spring;
      this.wheel = wheel;
      this.stockTire = tire;

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

    public Wheel getWheel() {
        return wheel;
    }


    public void setStockTire(double height, double width) {
       this.stockTire = new StockTire(height,width);
    }

    public String toString(){
      return "EconomySuspension has :\n" +
              "\t"+ stockShock.toString()+"\n"+
              "\t"+ stockSpring.toString()+"\n"+
              "\t"+ wheel.toString() +"\n" +
              "\t"+ stockTire.toString();
   }

}
