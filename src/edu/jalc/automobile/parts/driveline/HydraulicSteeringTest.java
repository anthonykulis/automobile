package edu.jalc.automobile.parts.driveline;

public class HydraulicSteeringTest{

  public void testHydraulicSteering(){
    System.out.println("Testing HydraulicSteering: :toString");
    HydraulicSteering hydraulicSteering = new HydraulicSteering();
    assert(hydraulicSteering.toString().equals("HydraulicSteering"));
  }

  public static void main(String... args){
    HydraulicSteeringTest hydraulicSteeringTest = new HydraulicSteeringTest();
    hydraulicSteeringTest.testHydraulicSteering();
    System.out.println("HydraulicSteering Test Passed");
  }
}
