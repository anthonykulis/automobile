package edu.jalc.automobile.onlinebuilder.components.suspension.economy;

<<<<<<< HEAD
import edu.jalc.automobile.parts.suspension.*;
=======
import edu.jalc.automobile.parts.suspension.StockShock;
import edu.jalc.automobile.parts.suspension.StockSpring;
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965

public class EconomySuspensionTest{
   
   public void testGetShock(){
      System.out.println("Testing EconomySuspension::getShock");
      StockShock shock = new StockShock(3);
<<<<<<< HEAD
      EconomySuspension economySuspension = new EconomySuspension(shock, null,null);
      assert(shock == economySuspension.getShock());
=======
      EconomySuspension suspension = new EconomySuspension(shock, null);
      assert(shock == suspension.getShock());
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965
   }
   
   public void testGetSpring(){
      System.out.println("Testing EconomySuspension::getSpring");
      StockSpring spring = new StockSpring(3);
<<<<<<< HEAD
      EconomySuspension economySuspension = new EconomySuspension(null, spring,null);
      assert(spring == economySuspension.getSpring());
   }
   public void testGetTire() {
      System.out.println("Testing EconomySuspension::getWheel");
      StockTire tire = new StockTire(10,30);
      EconomySuspension economySuspension = new EconomySuspension(null, null,tire);

      assert(tire == economySuspension.getTire());
=======
      EconomySuspension suspension = new EconomySuspension(null, spring);
      assert(spring == suspension.getSpring());
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965
   }
   
   public static void main(String[] args){
      EconomySuspensionTest test = new EconomySuspensionTest();
      test.testGetShock();
      test.testGetSpring();
<<<<<<< HEAD
      test.testGetTire();
=======
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965
      System.out.println("All Tests for EconomySuspension Passed");
   }
}