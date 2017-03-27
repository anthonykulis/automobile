package edu.jalc.automobile.onlinebuilder.components.suspension.towing;

<<<<<<< HEAD
import edu.jalc.automobile.onlinebuilder.components.suspension.sport.SportRaised;
import edu.jalc.automobile.parts.suspension.*;
=======
import edu.jalc.automobile.parts.suspension.SuperShock;
import edu.jalc.automobile.parts.suspension.SuperSpring;
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965

public class TowingSuperDutyTest{

   public void testGetShock(){
      System.out.println("Testing TowingSuperDuty::getShock");
      SuperShock shock = new SuperShock(3);
<<<<<<< HEAD
      TowingSuperDuty tow = new TowingSuperDuty(shock, null,null);
=======
      TowingSuperDuty tow = new TowingSuperDuty(shock, null);
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965
      assert(shock == tow.getShock());
   }

   public void testGetSpring(){
      System.out.println("Testing TowingSuperDuty::getSpring");
      SuperSpring spring = new SuperSpring(3);
<<<<<<< HEAD
      TowingSuperDuty tow = new TowingSuperDuty(null, spring,null);
      assert(spring == tow.getSpring());
   }
   public void testGetTire() {
      System.out.println("Testing TowingSuperDuty::getTire");
      AllTerrainTire tire = new AllTerrainTire(10,30);
      TowingSuperDuty towingSuperDuty = new TowingSuperDuty(null, null,tire);

      assert(tire == towingSuperDuty.getTire());
   }
=======
      TowingSuperDuty tow = new TowingSuperDuty(null, spring);
      assert(spring == tow.getSpring());
   }
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965

   public static void main(String[] args){
      TowingSuperDutyTest test = new TowingSuperDutyTest();
      test.testGetShock();
      test.testGetSpring();
<<<<<<< HEAD
      test.testGetTire();

=======
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965
      System.out.println("All Tests for TowingSuperDuty Passed");
   }
}
