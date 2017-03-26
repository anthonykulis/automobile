package edu.jalc.automobile.onlinebuilder.components.suspension.towing;

import edu.jalc.automobile.parts.suspension.SuperShock;
import edu.jalc.automobile.parts.suspension.SuperSpring;

public class TowingSuperDutyTest{

   public void testGetShock(){
      System.out.println("Testing TowingSuperDuty::getShock");
      SuperShock shock = new SuperShock();
      TowingSuperDuty tow = new TowingSuperDuty(shock, null);
      assert(shock == tow.getShock());
   }

   public void testGetSpring(){
      System.out.println("Testing TowingSuperDuty::getSpring");
      SuperSpring spring = new SuperSpring();
      TowingSuperDuty tow = new TowingSuperDuty(null, spring);
      assert(spring == tow.getSpring());
   }

   public static void main(String[] args){
      TowingSuperDutyTest test = new TowingSuperDutyTest();
      test.testGetShock();
      test.testGetSpring();
      System.out.println("All Tests for TowingSuperDuty Passed");
   }
}
