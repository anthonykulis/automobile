package edu.jalc.automobile.parts.driveline;

public class AllWheelDriveAxleTest{

  public void testAllWheelDriveAxle(){
    System.out.println("Testing AllWheelDriveAxle: :toString");
    AllWheelDriveAxle allWheelDriveAxle = new AllWheelDriveAxle();
    assert(allWheelDriveAxle.toString().equals("AllWheelDriveAxle"));
  }

  public static void main(String... args){
    AllWheelDriveAxleTest allWheelDriveAxleTest = new AllWheelDriveAxleTest();
    allWheelDriveAxleTest.testAllWheelDriveAxle();
    System.out.println("AllWheelDriveAxle Test Passed");
  }
}
