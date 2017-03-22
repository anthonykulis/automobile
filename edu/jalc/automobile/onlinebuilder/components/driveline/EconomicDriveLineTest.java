package edu.jalc.automobile.onlinebuilder.components.driveline;
 
import edu.jalc.automobile.parts.driveline.ElectricSteering;
import edu.jalc.automobile.parts.driveline.OpenDifferential;

 public  class EconomicDriveLineTest{

public void testGetElectricSteering(){
  System.out.println("Testing  EconomicDriveLine :: getElectricSteering");
     ElectricSteering electricSteering=new ElectricSteering();
     assert(EconomicDriveLine.getElectricSteering()==electricSteering);

}

}