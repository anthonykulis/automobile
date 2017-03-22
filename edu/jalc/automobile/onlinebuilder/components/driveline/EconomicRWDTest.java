package edu.jalc.automobile.onlinebuilder.components.driveline;

import edu.jalc.automobile.onlinebuilder.components.driveline.EconomicRWD;
import edu.jalc.automobile.parts.driveline.FrontDeadAxle;
import edu.jalc.automobile.parts.driveline.RearDriveAxle;
import edu.jalc.automobile.parts.driveline.DriveShaft ; 

public  class EconomicRWDTest{

   EconomicRWD economicRWD=new EconomicRWD();

   public void testGetFrontDeadAxle(){
      System.out.println("Testing  EconomicRWD ::getFrontDeadAxle(");
      FrontDeadAxle frontDeadAxle = new  FrontDeadAxle();
     
      assert( frontDeadAxle==economicRWD.getFrontDeadAxle());
   }
   public void testGetRearDriveAxle(){
      System.out.println("Testing  EconomicRWD ::getRearDriveAxle(");
      RearDriveAxle rearDriveAxle = new  RearDriveAxle();
      assert( rearDriveAxle==economicRWD.getRearDriveAxle());
   }
   public void testGetDriveShaft(){
      System.out.println("Testing  EconomicRWD ::getDriveShaft(");
      DriveShaft driveShaft = new  DriveShaft();
      assert( driveShaft==economicRWD.getDriveShaft());
   }
 public static void main(String... args) throws Exception {
      EconomicRWDTest test = new EconomicRWDTest();
   	
      //test.testGetFrontDeadAxle();
      test.testGetRearDriveAxle();
      test.testGetDriveShaft();
   
      System.out.println("All Tests passed");
   }
}
