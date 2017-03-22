package edu.jalc.automobile.parts;


public class ForgedWheelTest {
  public void testGetSize(){
     System.out.println("Testing ForgedWheel::getHeight");
     ForgedWheel forgedWheel = new ForgedWheel(30);
     assert(forgedWheel.getSize() == 30);
  }

  public static void main(String[] args){
     ForegedWheelTest test = new ForegedWheelTest();
     test.testGetHeight();

     System.out.println("All Tests for ForgedWheel Passed");
  }

}
