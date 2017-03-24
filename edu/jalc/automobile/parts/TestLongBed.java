package edu.jalc.automobile.parts;

public class TestLongBed{
  public void testGetCubicFt(){
    System.out.println("Testing getCubicFt() :: LongBed");
    LongBed longBed = new LongBed(3.3);
    assert(longBed.getCubicFt() == 3.3);
  }
  public static void main(String[] args){
    TestLongBed testLongBed = new TestLongBed();
    testLongBed.testGetCubicFt();
    System.out.println("Test Complete");
  }
}
