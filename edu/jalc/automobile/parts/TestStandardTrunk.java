package edu.jalc.automobile.parts;

public class TestStandardTrunk{
  public void testGetCubicFt(){
    System.out.println("Testing getCubicFt() :: StandardTrunk");
    StandardTrunk standardTrunk = new StandardTrunk(9.9);
    assert(standardTrunk.getCubicFt() == 9.9);
  }
  public static void main(String[] args){
    TestStandardTrunk testStandardTrunk = new TestStandardTrunk();
    testStandardTrunk.testGetCubicFt();
    System.out.println("Test Complete");
  }
}
