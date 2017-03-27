package edu.jalc.automobile.parts.body;

public class TestHatchback{
  public void testGetCubicFt(){
    System.out.println("Testing getCubicFt() :: Hatchback");
    Hatchback hatchback = new Hatchback(6.5);
    assert(hatchback.getCubicFt() == 6.5);
  }
  public static void main(String[] args){
    TestHatchback testHatchback = new TestHatchback();
    testHatchback.testGetCubicFt();
    System.out.println("Test Complete");
  }
}
