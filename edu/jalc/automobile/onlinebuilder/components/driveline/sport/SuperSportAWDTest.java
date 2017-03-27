package edu.jalc.automobile.onlinebuilder.components.driveline.sport;

import edu.jalc.automobile.onlinebuilder.components.driveline.SportDriveLine;
import edu.jalc.automobile.parts.driveline.AllWheelDriveAxle;

public class SuperSportAWDTest{

  public void testGetAllWheelDriveAxle(){
    System.out.println("Testing SuperSportAWD: :getAllWheelDriveAxle");
    AllWheelDriveAxle allWheelDriveAxle = new AllWheelDriveAxle();
    SuperSportAWD superSportAWD = new SuperSportAWD(allWheelDriveAxle, null, null, null);
    assert(superSportAWD.getAllWheelDriveAxle() == allWheelDriveAxle);
  }

  public static void main(String... args){
    SuperSportAWDTest superSportAWDTest = new SuperSportAWDTest();
    superSportAWDTest.testGetAllWheelDriveAxle();
    System.out.println("SuperSportAWD Test Passed");
  }
}
