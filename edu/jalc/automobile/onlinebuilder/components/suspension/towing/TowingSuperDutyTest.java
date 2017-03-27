package edu.jalc.automobile.onlinebuilder.components.suspension.towing;

import edu.jalc.automobile.onlinebuilder.components.suspension.sport.SportRaised;
import edu.jalc.automobile.parts.suspension.*;

public class TowingSuperDutyTest{

   public void testGetShock(){
      System.out.println("Testing TowingSuperDuty::getShock");
      SuperShock shock = new SuperShock(3);
      TowingSuperDuty tow = new TowingSuperDuty(shock, null,null);
      assert(shock == tow.getShock());
   }

   public void testGetSpring(){
      System.out.println("Testing TowingSuperDuty::getSpring");
      SuperSpring spring = new SuperSpring(3);
      TowingSuperDuty tow = new TowingSuperDuty(null, spring,null);
      assert(spring == tow.getSpring());
   }
   public void testGetTire() {
      System.out.println("Testing TowingSuperDuty::getTire");
      AllTerrainTire tire = new AllTerrainTire(10,30);
      TowingSuperDuty towingSuperDuty = new TowingSuperDuty(null, null,tire);

      assert(tire == towingSuperDuty.getTire());
   }

   public static void main(String[] args){
      TowingSuperDutyTest test = new TowingSuperDutyTest();
      test.testGetShock();
      test.testGetSpring();
      test.testGetTire();

      System.out.println("All Tests for TowingSuperDuty Passed");
   }
}
