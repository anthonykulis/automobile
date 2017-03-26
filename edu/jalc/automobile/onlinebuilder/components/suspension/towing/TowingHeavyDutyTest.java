package edu.jalc.automobile.onlinebuilder.components.suspension.towing;

public class TowingHeavyDutyTest{
   
   public void testGetShock(){
      System.out.println("Testing TowingHeavyDuty::getShock");
      HeavyShock shock = new HeavyShock();
      TowingHeavyDuty tow = new TowingHeavyDuty(shock, null);
      assert(shock == tow.getShock());
   }
   
   public void testGetSpring(){
      System.out.println("Testing TowingHeavyDuty::getSpring");
      HeavySpring spring = new HeavySpring();
      TowingHeavyDuty tow = new TowingHeavyDuty(null, spring);
      assert(spring == tow.getSpring());
   }
   
   public static void main(String[] args){
      TowingHeavyDutyTest test = new TowingHeavyDutyTest();
      test.testGetShock();
      test.testGetSpring();
      System.out.println("All Tests for TowingHeavyDuty Passed");
   }
}