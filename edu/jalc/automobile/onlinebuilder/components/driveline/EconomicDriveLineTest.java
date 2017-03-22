package edu.jalc.automobile.onlinebuilder.components.driveline; 

import edu.jalc.automobile.parts.driveline.ElectricSteering;
import edu.jalc.automobile.parts.driveline.OpenDifferential;
import edu.jalc.automobile.onlinebuilder.components.driveline.EconomicDriveLine;

public  class EconomicDriveLineTest{

   public void testGetElectricSteering(){
      System.out.println("Testing  EconomicDriveLine::getElectricSteering(");
      ElectricSteering electricSteering = new  ElectricSteering();
      EconomicDriveLine economicDriveLine = new EconomicDriveLine (electricSteering,null);
      assert( electricSteering == economicDriveLine .getElectricSteering());
   }
   public void testGetOpenDifferential(){
      System.out.println("Testing  EconomicDriveLine::getOpenDifferential(");
      OpenDifferential openDifferential = new  OpenDifferential();
       EconomicDriveLine economicDriveLine =new EconomicDriveLine (null,openDifferential);
      assert( openDifferential== economicDriveLine.getOpenDifferential());
   }
 public static void main(String... args) throws Exception {
      EconomicDriveLineTest test = new EconomicDriveLineTest();
   	
      test.testGetElectricSteering();
      test.testGetOpenDifferential();
      System.out.println("All EconomicDriveLine tests passed");
   }
}