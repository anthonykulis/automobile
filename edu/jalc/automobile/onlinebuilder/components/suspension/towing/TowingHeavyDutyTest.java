package edu.jalc.automobile.onlinebuilder.components.suspension.towing;

<<<<<<< HEAD
import edu.jalc.automobile.onlinebuilder.components.suspension.sport.SportRaised;
import edu.jalc.automobile.parts.suspension.*;
=======
import edu.jalc.automobile.parts.suspension.HeavyShock;
import edu.jalc.automobile.parts.suspension.HeavySpring;
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965

public class TowingHeavyDutyTest{
   
   public void testGetShock(){
      System.out.println("Testing TowingHeavyDuty::getShock");
      HeavyShock shock = new HeavyShock(3);
<<<<<<< HEAD
      TowingHeavyDuty tow = new TowingHeavyDuty(shock, null,null);
=======
      TowingHeavyDuty tow = new TowingHeavyDuty(shock, null);
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965
      assert(shock == tow.getShock());
   }
   
   public void testGetSpring(){
      System.out.println("Testing TowingHeavyDuty::getSpring");
      HeavySpring spring = new HeavySpring(3);
<<<<<<< HEAD
      TowingHeavyDuty tow = new TowingHeavyDuty(null, spring,null);
      assert(spring == tow.getSpring());
   }
   public void testGetTire() {
      System.out.println("Testing TowingHeavyDuty::getTire");
      AllTerrainTire tire = new AllTerrainTire(10,30);
      TowingHeavyDuty towingHeavyDuty = new TowingHeavyDuty(null, null,tire);

      assert(tire == towingHeavyDuty.getTire());
   }
=======
      TowingHeavyDuty tow = new TowingHeavyDuty(null, spring);
      assert(spring == tow.getSpring());
   }
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965
   
   public static void main(String[] args){
      TowingHeavyDutyTest test = new TowingHeavyDutyTest();
      test.testGetShock();
      test.testGetSpring();
<<<<<<< HEAD
      test.testGetTire();
=======
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965
      System.out.println("All Tests for TowingHeavyDuty Passed");
   }
}