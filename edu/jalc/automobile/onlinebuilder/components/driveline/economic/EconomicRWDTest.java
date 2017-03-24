package edu.jalc.automobile.onlinebuilder.components.driveline.economic;

import edu.jalc.automobile.onlinebuilder.components.driveline.economic.EconomicRWD;
import edu.jalc.automobile.parts.driveline.FrontDeadAxle;
import edu.jalc.automobile.parts.driveline.RearDriveAxle;
import edu.jalc.automobile.parts.driveline.DriveShaft ; 

public  class EconomicRWDTest{

   public void testGetFrontDeadAxle(){
      System.out.println("Testing  EconomicRWD ::getFrontDeadAxle(");
      FrontDeadAxle frontDeadAxle = new  FrontDeadAxle();
      EconomicRWD economicRWD=new EconomicRWD(frontDeadAxle,null,null,null,null);
      assert( frontDeadAxle==economicRWD.getFrontDeadAxle());
   }
   public void testGetRearDriveAxle(){
      System.out.println("Testing  EconomicRWD ::getRearDriveAxle(");
      RearDriveAxle rearDriveAxle = new  RearDriveAxle();
      EconomicRWD economicRWD=new EconomicRWD(null,rearDriveAxle,null,null,null);
      assert( rearDriveAxle==economicRWD.getRearDriveAxle());
   }
   public void testGetDriveShaft(){
      System.out.println("Testing  EconomicRWD ::getDriveShaft(");
      DriveShaft driveShaft = new  DriveShaft();
      EconomicRWD economicRWD=new EconomicRWD(null,null,driveShaft,null,null);
      assert( driveShaft==economicRWD.getDriveShaft());
   }
   public static void main(String... args) throws Exception {
      EconomicRWDTest test = new EconomicRWDTest();
   	
      test.testGetFrontDeadAxle();
      test.testGetRearDriveAxle();
      test.testGetDriveShaft();
      System.out.println("All EconomicRWDTest passed");
   }
}
