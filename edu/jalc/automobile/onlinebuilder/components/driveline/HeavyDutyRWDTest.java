package edu.jalc.automobile.onlinebuilder.components.driveline;

import edu.jalc.automobile.parts.driveline.RearDriveAxle;
import edu.jalc.automobile.parts.driveline.FrontDeadAxle;

public class HeavyDutyRWDTest{

   protected void testGetRearAxle(){
      System.out.println("Testing HeavyDutyRWD::getRearAxle");
      RearDriveAxle rearAxle = new RearDriveAxle();
      HeavyDutyRWD heavyDutyRWD = new HeavyDutyRWD(rearAxle, null);
      assert(heavyDutyRWD.getRearAxle() == rearAxle);
   }
   
   protected void testGetFrontDeadAxle(){
      System.out.println("Testing HeavyDutyRWD::getFrontDeadAxle");
      FrontDeadAxle frontDeadAxle = new FrontDeadAxle();
      HeavyDutyRWD heavyDutyRWD = new HeavyDutyRWD(null, frontDeadAxle);
      assert(heavyDutyRWD.getDeadAxle() == frontDeadAxle);
   }
      
   public static void main(String[] args){
      HeavyDutyRWDTest test = new HeavyDutyRWDTest();
      test.testGetRearAxle();
      test.testGetFrontDeadAxle();
      System.out.println("HeavyDutyRWDTest compleat");
   } 
}