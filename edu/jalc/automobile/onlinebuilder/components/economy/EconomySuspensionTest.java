package edu.jalc.automobile.onlinebuilder.components.economy;

import edu.jalc.automobile.parts.*;

public class EconomySuspensionTest{
   
   public void testGetShock(){
      System.out.println("Testing EconomySuspension::getShock");
      StockShock shock = new StockShock();
      EconomySuspension suspension = new EconomySuspension(shock, null);
      assert(shock == suspension.getShock());
   }
   
   public void testGetSpring(){
      System.out.println("Testing EconomySuspension::getSpring");
      StockSpring spring = new StockSpring();
      EconomySuspension suspension = new EconomySuspension(null, spring);
      assert(spring == suspension.getSpring());
   }
   
   public static void main(String[] args){
      EconomySuspensionTest test = new EconomySuspensionTest();
      test.testGetShock();
      test.testGetSpring();
      System.out.println("All Tests for EconomySuspension Passed");
   }
}