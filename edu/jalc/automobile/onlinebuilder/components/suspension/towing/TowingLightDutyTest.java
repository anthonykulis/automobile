package edu.jalc.automobile.onlinebuilder.components.suspension.towing;

import edu.jalc.automobile.onlinebuilder.components.suspension.sport.SportRaised;
import edu.jalc.automobile.parts.suspension.*;

public class TowingLightDutyTest{
   
   public void testGetShock(){
      System.out.println("Testing TowingLightDuty::getShock");
      LightShock shock = new LightShock(3);
      TowingLightDuty tow = new TowingLightDuty(shock, null,null);
      assert(shock == tow.getShock());
   }
   
   public void testGetSpring(){
      System.out.println("Testing TowingLightDuty::getSpring");
      LightSpring spring = new LightSpring(3);
      TowingLightDuty tow = new TowingLightDuty(null, spring,null);
      assert(spring == tow.getSpring());
   }
   public void testGetTire() {
      System.out.println("Testing TowingLightDuty::getTire");
      AllTerrainTire tire = new AllTerrainTire(10, 30);
      TowingLightDuty towingLightDuty = new TowingLightDuty(null, null, tire);

      assert (tire == towingLightDuty.getTire());
   }

   
   public static void main(String[] args){
      TowingLightDutyTest test = new TowingLightDutyTest();
      test.testGetShock();
      test.testGetSpring();
      System.out.println("All Tests for TowingLightDuty Passed");
   }
}