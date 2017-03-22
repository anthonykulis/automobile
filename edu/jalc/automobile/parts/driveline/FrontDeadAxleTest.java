package edu.jalc.automobile.parts.sportlineparts;

public class FrontDeadAxleTest{

  public void testFrontDeadAxle(){
    System.out.println("Testing FrontDeadAxle: : toString");
    FrontDeadAxle frontDeadAxle = new FrontDeadAxle();
    assert(frontDeadAxle.toString().equals("FrontDeadAxle"));
  }

  public static void main(String... args){
    FrontDeadAxleTest frontDeadAxleTest = new FrontDeadAxleTest();
    frontDeadAxleTest.testFrontDeadAxle();
    System.out.println("FrontDeadAxle Test Passed");
  }
}
