package edu.jalc.automobile.parts;

public class TestLuxuryCabin{
  public void testGetSeat(){
    System.out.println("Testing getSeat() :: LuxuryCabin");
    LuxuryCabin luxuryCabin = new LuxuryCabin();
    assert(luxuryCabin.getSeat() == leatherSeat);
  }
  public static void main(String[] args){
    TestLuxuryCabin testLuxuryCabin = new TestLuxuryCabin();
    testLuxuryCabin.testGetSeat();
    System.out.println("Test Complete");
  }
}
