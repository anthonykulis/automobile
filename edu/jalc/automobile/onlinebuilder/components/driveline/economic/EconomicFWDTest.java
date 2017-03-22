package edu.jalc.automobile.onlinebuilder.components.driveline.economic;

import edu.jalc.automobile.parts.driveline.FrontDriveAxle;
import edu.jalc.automobile.parts.driveline.RearDeadAxle;

public  class EconomicFWDTest{

   public void testGetFrontDriveAxle(){
      System.out.println("Testing  EconomicFWD :: getFrontDriveAxle");
      FrontDriveAxle frontDriveAxle = new  FrontDriveAxle();
      EconomicFWD economicFWD =new EconomicFWD(frontDriveAxle,null);
      assert( frontDriveAxle == economicFWD.getFrontDriveAxle());
   }
   public void testGetRearDeadAxle(){
      System.out.println("Testing  EconomicFWD ::getRearDeadAxle");
      RearDeadAxle rearDeadAxle = new  RearDeadAxle();
       EconomicFWD economicFWD=new EconomicFWD(null,rearDeadAxle);
      assert( rearDeadAxle==economicFWD.getRearDeadAxle());
   }
 public static void main(String... args) throws Exception {
      EconomicFWDTest test = new EconomicFWDTest();
   	
      test.testGetFrontDriveAxle();
      test.testGetRearDeadAxle();
      System.out.println("All EconomicFWDTest passed");
   }
}
