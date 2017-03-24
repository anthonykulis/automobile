package edu.jalc.automobile.onlinebuilder.components.driveline.truck;

import edu.jalc.automobile.parts.driveline.RearDriveAxle;
import edu.jalc.automobile.parts.driveline.FrontDeadAxle;

public class HeavyDutyRWDTest{

   protected void testGetRearAxle(){
      System.out.println("Testing HeavyDutyRWD::getRearDriveAxle");
      RearDriveAxle rearDriveAxle = new RearDriveAxle();
      HeavyDutyRWD heavyDutyRWD = new HeavyDutyRWD(rearDriveAxle, null, null, null, null);
      assert(heavyDutyRWD.getRearDriveAxle() == rearDriveAxle);
   }
   
   protected void testGetFrontDeadAxle(){
      System.out.println("Testing HeavyDutyRWD::getFrontDeadAxle");
      FrontDeadAxle frontDeadAxle = new FrontDeadAxle();
      HeavyDutyRWD heavyDutyRWD = new HeavyDutyRWD(null, frontDeadAxle, null, null, null);
      assert(heavyDutyRWD.getFrontDeadAxle() == frontDeadAxle);
   }
      
   public static void main(String[] args){
      HeavyDutyRWDTest test = new HeavyDutyRWDTest();
      test.testGetRearAxle();
      test.testGetFrontDeadAxle();
      System.out.println("HeavyDutyRWDTest compleat");
   } 
}