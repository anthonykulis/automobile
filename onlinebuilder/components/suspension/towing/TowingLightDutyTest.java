package edu.jalc.automobile.onlinebuilder.components.suspension.towing;

import edu.jalc.automobile.onlinebuilder.components.suspension.sport.SportRaised;
import edu.jalc.automobile.parts.suspension.*;

public class TowingLightDutyTest{

   public void testGetShock(){
      System.out.println("Testing TowingLightDuty::getShock");
      LightShock shock = new LightShock(3);
      TowingLightDuty tow = new TowingLightDuty(shock, null,null,null);
      assert(shock.getHeight() == tow.getShock().getHeight());
   }

   public void testGetSpring(){
      System.out.println("Testing TowingLightDuty::getSpring");
      LightSpring spring = new LightSpring(3);
      TowingLightDuty tow = new TowingLightDuty(null, spring,null,null);
      assert(spring.getHeight() == tow.getSpring().getHeight());
   }
   public void testGetTire() {
      System.out.println("Testing TowingLightDuty::getTire");
      AllTerrainTire tire = new AllTerrainTire(10, 30);
      TowingLightDuty towingLightDuty = new TowingLightDuty(null, null, tire,null);

      assert(tire == towingLightDuty.getTire());
   }

   public void testGetWheel() {
      System.out.println("Testing TowingLightDuty::getWheel");
      SteelWheel steelWheel = new SteelWheel(5);

      TowingLightDuty towingLightDuty = new TowingLightDuty(null,null,null,steelWheel);
      assert (steelWheel.getSize() == towingLightDuty.getWheel().getSize());
   }



   public static void main(String[] args){
      TowingLightDutyTest test = new TowingLightDutyTest();
      test.testGetShock();
      test.testGetSpring();
      test.testGetTire();
      test.testGetWheel();
      System.out.println("All Tests for TowingLightDuty Passed");
   }
}
