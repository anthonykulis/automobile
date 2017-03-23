package edu.jalc.automobile.parts;

public class TestShortBed{
  public void testGetCubicFt(){
    System.out.println("Testing getCubicFt() :: ShortBed");
    ShortBed shortBed = new ShortBed(2.2);
    assert(shortBed.getCubicFt() == 2.2);
  }
  public static void main(String[] args){
    TestShortBed testShortBed = new TestShortBed();
    testShortBed.testGetCubicFt();
    System.out.println("Test Complete");
  }
}
