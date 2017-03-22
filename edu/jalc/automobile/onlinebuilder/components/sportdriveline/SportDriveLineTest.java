package edu.jalc.automobile.onlinebuilder.components.sportdriveline;

public class SportDriveLineTest{

  public void testDriveShaft(){
    System.out.println("Testing SportDriveLine: :getDriveShaft");
    DriveShaft driveShaft = new DriveShaft();
    assert(driveShaft.getDriveShaft().equals("DriveShaft"));
  }

  public void testHydraulicSteering(){
    System.out.println("Testing SportDriveLine: :getHydraulicSteering");
    HydraulicSteering hydraulicSteering = new HydraulicSteering();
    assert(hydraulicSteering.getHydraulicSteering().equals("HydraulicSteering"));
  }

  public void testTorqueVectorDifferential(){
    System.out.println("Testing SportDriveLine: :getTorqueVectorDifferential");
    TorqueVectorDifferential torqueVectorDifferential = new TorqueVectorDifferential();
    assert(torqueVectorDifferential.getTorqueVectorDifferential().equals("TorqueVectorDifferential"));
  }

  public static void main(String... args){
    SportDriveLineTest sportDriveLineTest = new SportDriveLineTest();
    sportDriveLineTest.testDriveShaft();
    sportDriveLineTest.testHydraulicSteering();
    sportDriveLineTest.testTorqueVectorDifferential();
    System.out.println("SportDriveLine Test Passed");
  }
}
