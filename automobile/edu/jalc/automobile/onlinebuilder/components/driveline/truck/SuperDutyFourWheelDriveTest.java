package edu.jalc.automobile.onlinebuilder.components.driveline.truck;

import edu.jalc.automobile.parts.driveline.FourWheelDriveAxle;

public class SuperDutyFourWheelDriveTest{

   protected void testGetFWDAxle(){
      System.out.println("Testing SuperDutyFourWheelDrive::getFWDAxle");
      FourWheelDriveAxle fwdAxle = new FourWheelDriveAxle();
      SuperDutyFourWheelDrive superDutyFWD = new SuperDutyFourWheelDrive(fwdAxle, null, null, null);
      assert(superDutyFWD.getFWDAxle() == fwdAxle);
   }
         
   public static void main(String[] args){
      SuperDutyFourWheelDriveTest test = new SuperDutyFourWheelDriveTest();
      test.testGetFWDAxle();
      System.out.println("SuperDutyFourWheelDriveTest compleat");
   } 
}