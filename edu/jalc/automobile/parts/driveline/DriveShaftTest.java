package edu.jalc.automobile.parts.sportlineparts;

public class DriveShaftTest{

  public void testDriveShaft(){
    System.out.println("Testing DriveShaft: :toString");
    DriveShaft driveShaft = new DriveShaft();
    assert(driveShaft.toString().equals("DriveShaft"));
  }

  public static void main(String... args){
    DriveShaftTest driveShaftTest = new DriveShaftTest();
    driveShaftTest.testDriveShaft();
    System.out.println("DriveShaft Test Passed");
  }
}
