package edu.jalc.automobile.parts;

public class TestLuxuryCabin{
  public void testGetSeat(){
    System.out.println("Testing getSeat() :: LuxuryCabin");
    LeatherSeat leatherSeat = new LeatherSeat("leatherseat");
    LuxurySeat luxurySeat = new LuxurySeat(leatherSeat);
    Seat seat = new Seat(luxurySeat);
    LuxuryCabin luxuryCabin = new LuxuryCabin(seat);
    assert(luxuryCabin.getSeat().equals("leatherseat"));
  }
  public static void main(String[] args){
    TestLuxuryCabin testLuxuryCabin = new TestLuxuryCabin();
    testLuxuryCabin.testGetSeat();
    System.out.println("Test Complete");
  }
}
