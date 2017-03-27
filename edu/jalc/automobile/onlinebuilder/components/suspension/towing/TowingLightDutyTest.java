package edu.jalc.automobile.onlinebuilder.components.suspension.towing;

<<<<<<< HEAD
import edu.jalc.automobile.onlinebuilder.components.suspension.sport.SportRaised;
import edu.jalc.automobile.parts.suspension.*;
=======
import edu.jalc.automobile.parts.suspension.LightShock;
import edu.jalc.automobile.parts.suspension.LightSpring;
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965

public class TowingLightDutyTest{
   
   public void testGetShock(){
      System.out.println("Testing TowingLightDuty::getShock");
      LightShock shock = new LightShock(3);
<<<<<<< HEAD
      TowingLightDuty tow = new TowingLightDuty(shock, null,null);
=======
      TowingLightDuty tow = new TowingLightDuty(shock, null);
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965
      assert(shock == tow.getShock());
   }
   
   public void testGetSpring(){
      System.out.println("Testing TowingLightDuty::getSpring");
      LightSpring spring = new LightSpring(3);
<<<<<<< HEAD
      TowingLightDuty tow = new TowingLightDuty(null, spring,null);
      assert(spring == tow.getSpring());
   }
   public void testGetTire() {
      System.out.println("Testing TowingLightDuty::getTire");
      AllTerrainTire tire = new AllTerrainTire(10, 30);
      TowingLightDuty towingLightDuty = new TowingLightDuty(null, null, tire);

      assert (tire == towingLightDuty.getTire());
   }

=======
      TowingLightDuty tow = new TowingLightDuty(null, spring);
      assert(spring == tow.getSpring());
   }
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965
   
   public static void main(String[] args){
      TowingLightDutyTest test = new TowingLightDutyTest();
      test.testGetShock();
      test.testGetSpring();
      System.out.println("All Tests for TowingLightDuty Passed");
   }
}