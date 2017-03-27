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
      System.out.println("Testing EconomySuspension::getWheel");
      StockTire tire = new StockTire(10,30);
      EconomySuspension economySuspension = new EconomySuspension(null, null,tire);

      assert(tire == economySuspension.getTire());
   }
   
   public static void main(String[] args){
      EconomySuspensionTest test = new EconomySuspensionTest();
      test.testGetShock();
      test.testGetSpring();
      test.testGetTire();
      System.out.println("All Tests for EconomySuspension Passed");

   }
}