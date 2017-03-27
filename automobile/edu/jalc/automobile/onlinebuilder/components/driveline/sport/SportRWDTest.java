package edu.jalc.automobile.onlinebuilder.components.driveline.sport;

import edu.jalc.automobile.onlinebuilder.components.driveline.SportDriveLine;
import edu.jalc.automobile.parts.driveline.FrontDeadAxle;
import edu.jalc.automobile.parts.driveline.RearDriveAxle;

public class SportRWDTest{

  public void testGetFrontDeadAxle(){
    System.out.println("Testing SportRWD: :getFrontDeadAxle");
    FrontDeadAxle frontDeadAxle = new FrontDeadAxle();
    SportRWD sportRWD = new SportRWD(frontDeadAxle, null, null, null, null);
    assert(sportRWD.getFrontDeadAxle() == frontDeadAxle);
  }

  public void testGetRearDriveAxle(){
    System.out.println("Testing SportRWD: :getRearDriveAxle");
    RearDriveAxle rearDriveAxle = new RearDriveAxle();
    SportRWD sportRWD = new SportRWD(null, rearDriveAxle, null, null, null);
    assert(sportRWD.getRearDriveAxle() == rearDriveAxle);
  }

  public static void main(String... args){
    SportRWDTest sportRWDTest = new SportRWDTest();
    sportRWDTest.testGetFrontDeadAxle();
    sportRWDTest.testGetRearDriveAxle();
    System.out.println("SportRWD Test Passed");
  }
}
