package edu.jalc.automobile.parts;

public class TestStandardCabin{
  public void testGetSeat(){
    System.out.println("Testing getSeat() :: StandardCabin");
    StandardCabin standardCabin = new StandardCabin();
    assert(standardCabin.getSeat() == clothSeat);
  }
  public static void main(String[] args){
    TestStandardCabin testStandardCabin = new TestStandardCabin();
    testStandardCabin.testGetSeat();
    System.out.println("Test Complete");
  }
}
