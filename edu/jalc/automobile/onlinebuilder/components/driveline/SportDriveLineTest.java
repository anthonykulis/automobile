package edu.jalc.automobile.onlinebuilder.components.driveline;

import edu.jalc.automobile.parts.driveline.DriveShaft;
import edu.jalc.automobile.parts.driveline.HydraulicSteering;
import edu.jalc.automobile.parts.driveline.TorqueVectorDifferential;

public class SportDriveLineTest{

  public void testGetDriveShaft(){
    System.out.println("Testing SportDriveLine: :getDriveShaft");
    DriveShaft driveShaft = new DriveShaft();
    SportDriveLine sportDriveLine = new SportDriveLine(driveShaft, null, null);
    assert(sportDriveLine.getDriveShaft() == driveShaft);
  }

  public void testGetHydraulicSteering(){
    System.out.println("Testing SportDriveLine: :getHydraulicSteering");
    HydraulicSteering hydraulicSteering = new HydraulicSteering();
    SportDriveLine sportDriveLine = new SportDriveLine(null, hydraulicSteering, null);
    assert(sportDriveLine.getHydraulicSteering() == hydraulicSteering);
  }

  public void testGetTorqueVectorDifferential(){
    System.out.println("Testing SportDriveLine: :getTorqueVectorDifferential");
    TorqueVectorDifferential torqueVectorDifferential = new TorqueVectorDifferential();
    SportDriveLine sportDriveLine = new SportDriveLine(null, null, torqueVectorDifferential);
    assert(sportDriveLine.getTorqueVectorDifferential() == torqueVectorDifferential);
  }

  public static void main(String... args){
    SportDriveLineTest sportDriveLineTest = new SportDriveLineTest();
    sportDriveLineTest.testGetDriveShaft();
    sportDriveLineTest.testGetHydraulicSteering();
    sportDriveLineTest.testGetTorqueVectorDifferential();
    System.out.println("SportDriveLine Test Passed");
  }
}
