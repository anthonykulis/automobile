package edu.jalc.automobile.parts.driveline;

public class RearDeadAxleTest{

  public void testRearDeadAxle(){
    System.out.println("Testing RearDeadAxle: : toString");
    RearDeadAxle rearDeadAxle = new RearDeadAxle();
    assert(rearDeadAxle.toString().equals("RearDeadAxle"));
  }

  public static void main(String... args){
    RearDeadAxleTest rearDeadAxleTest = new RearDeadAxleTest();
    rearDeadAxleTest.testRearDeadAxle();
    System.out.println("RearDeadAxle Test Passed");
  }
}
