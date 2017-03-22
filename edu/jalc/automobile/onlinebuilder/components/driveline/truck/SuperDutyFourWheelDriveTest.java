package edu.jalc.automobile.onlinebuilder.components.driveline.truck;

import edu.jalc.automobile.parts.driveline.FourWheelDriveAxle;

public class SuperDutyFourWheelDriveTest{

   protected void testGetFWDAxle(){
      System.out.println("Testing SuperDutyFourWheelDrive::getRearAxle");
      FourWheelDriveAxle fwdAxle = new FourWheelDriveAxle();
      SuperDutyFourWheelDrive superDutyFWD = new SuperDutyFourWheelDrive(fwdAxle);
      assert(superDutyFWD.getFWDAxle() == fwdAxle);
   }
         
   public static void main(String[] args){
      SuperDutyFourWheelDriveTest test = new SuperDutyFourWheelDriveTest();
      test.testGetFWDAxle();
      System.out.println("SuperDutyFourWheelDriveTest compleat");
   } 
}