package edu.jalc.automobile.onlinebuilder.components.suspension.towing;

import edu.jalc.automobile.onlinebuilder.components.suspension.sport.SportRaised;
import edu.jalc.automobile.parts.suspension.*;

public class TowingSuperDutyTest{

   public void testGetShock(){
      System.out.println("Testing TowingSuperDuty::getShock");
      SuperShock shock = new SuperShock(3);
      TowingSuperDuty tow = new TowingSuperDuty(shock, null,null,null);
      assert(shock.getHeight() == tow.getShock().getHeight());
   }

   public void testGetSpring(){
      System.out.println("Testing TowingSuperDuty::getSpring");
      SuperSpring spring = new SuperSpring(3);
      TowingSuperDuty tow = new TowingSuperDuty(null, spring,null,null);
      assert(spring.getHeight() == tow.getSpring().getHeight());
   }
   public void testGetTire() {
      System.out.println("Testing TowingSuperDuty::getTire");
      AllTerrainTire tire = new AllTerrainTire(10,30);
      TowingSuperDuty towingSuperDuty = new TowingSuperDuty(null, null,tire,null);

      assert(tire == towingSuperDuty.getTire());
   }

   public void testGetWheel() {
      System.out.println("Testing TowingLightDuty::getWheel");
      SteelWheel steelWheel = new SteelWheel(5);

      TowingSuperDuty towingSuperDuty = new TowingSuperDuty(null,null,null,steelWheel);
      assert (steelWheel.getSize() == towingSuperDuty.getWheel().getSize());
   }


   public static void main(String[] args){
      TowingSuperDutyTest test = new TowingSuperDutyTest();
      test.testGetShock();
      test.testGetSpring();
      test.testGetTire();
      test.testGetWheel();

      System.out.println("All Tests for TowingSuperDuty Passed");
   }
}
