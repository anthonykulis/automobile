package edu.jalc.automobile.onlinebuilder.components.suspension.towing;

import edu.jalc.automobile.parts.suspension.LightShock;
import edu.jalc.automobile.parts.suspension.LightSpring;

public class TowingLightDutyTest{
   
   public void testGetShock(){
      System.out.println("Testing TowingLightDuty::getShock");
      LightShock shock = new LightShock();
      TowingLightDuty tow = new TowingLightDuty(shock, null);
      assert(shock == tow.getShock());
   }
   
   public void testGetSpring(){
      System.out.println("Testing TowingLightDuty::getSpring");
      LightSpring spring = new LightSpring();
      TowingLightDuty tow = new TowingLightDuty(null, spring);
      assert(spring == tow.getSpring());
   }
   
   public static void main(String[] args){
      TowingLightDutyTest test = new TowingLightDutyTest();
      test.testGetShock();
      test.testGetSpring();
      System.out.println("All Tests for TowingLightDuty Passed");
   }
}