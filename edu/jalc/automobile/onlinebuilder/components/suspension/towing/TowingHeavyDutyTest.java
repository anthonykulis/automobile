package edu.jalc.automobile.onlinebuilder.components.suspension.towing;

import edu.jalc.automobile.onlinebuilder.components.suspension.sport.SportRaised;
import edu.jalc.automobile.parts.suspension.*;

public class TowingHeavyDutyTest{

   public void testGetShock(){
      System.out.println("Testing TowingHeavyDuty::getShock");
      HeavyShock shock = new HeavyShock(3);
      TowingHeavyDuty tow = new TowingHeavyDuty(shock, null,null,null);
      assert(shock == tow.getShock());
   }

   public void testGetSpring(){
      System.out.println("Testing TowingHeavyDuty::getSpring");
      HeavySpring spring = new HeavySpring(3);
      TowingHeavyDuty tow = new TowingHeavyDuty(null, spring,null,null);
      assert(spring == tow.getSpring());
   }
   public void testGetTire() {
      System.out.println("Testing TowingHeavyDuty::getTire");
      AllTerrainTire tire = new AllTerrainTire(10,30);
      TowingHeavyDuty towingHeavyDuty = new TowingHeavyDuty(null, null,tire,null);

      assert(tire = towingHeavyDuty.getTire();
   }
   public void testGetWheel() {
      System.out.println("Testing TowingHeavyDuty::getWheel");
      SteelWheel steelWheel = new SteelWheel(5);

      TowingHeavyDuty towingHeavyDuty = new TowingHeavyDuty(null,null,null,steelWheel);
      assert (steelWheel == towingHeavyDuty.getWheel());
   }

   public static void main(String[] args){
      TowingHeavyDutyTest test = new TowingHeavyDutyTest();
      test.testGetShock();
      test.testGetSpring();
      test.testGetTire();
      test.testGetWheel();
      System.out.println("All Tests for TowingHeavyDuty Passed");
   }
}
