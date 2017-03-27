package edu.jalc.automobile.onlinebuilder.components.suspension.economy;

import edu.jalc.automobile.parts.suspension.*;

public class EconomySuspensionTest{
   
   public void testGetShock(){
      System.out.println("Testing EconomySuspension::getShock");
      StockShock shock = new StockShock(3);
      EconomySuspension economySuspension = new EconomySuspension(shock, null,null);
      assert(shock == economySuspension.getShock());
   }
   
   public void testGetSpring(){
      System.out.println("Testing EconomySuspension::getSpring");
      StockSpring spring = new StockSpring(3);
      EconomySuspension economySuspension = new EconomySuspension(null, spring,null);
      assert(spring == economySuspension.getSpring());
   }
   public void testGetTire() {
      System.out.println("Testing EconomySuspension::getTire");
      StockTire tire = new StockTire(5,5);
      EconomySuspension economySuspension = new EconomySuspension(null, null,null);
      economySuspension.setStockTire(5,5);

      assert(tire == economySuspension.getTire());
   }
   public void testGetWheel() {
      System.out.println("Testing EconomySuspension::getWheel");




   }
   
   public static void main(String[] args){
      EconomySuspensionTest test = new EconomySuspensionTest();
      test.testGetShock();
      test.testGetSpring();
      test.testGetTire();
      System.out.println("All Tests for EconomySuspension Passed");

   }
}