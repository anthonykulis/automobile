package edu.jalc.automobile.parts.driveline;

public class RearDriveAxleTest{

  public void testGetRearDriveAxle(){
    System.out.println("Testing RearDriveAxle: : toString");
    RearDriveAxle rearDriveAxle = new RearDriveAxle();
    assert(rearDriveAxle.toString().equals("RearDriveAxle"));
  }

  public static void main(String... args){
    RearDriveAxleTest rearDriveAxleTest = new RearDriveAxleTest();
    rearDriveAxleTest.testGetRearDrivedAxle();
    System.out.println("RearDriveAxle Test Passed");
  }
}
