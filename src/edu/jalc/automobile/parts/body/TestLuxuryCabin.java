package edu.jalc.automobile.parts.body;

import edu.jalc.automobile.parts.LuxurySeat;
import edu.jalc.automobile.parts.body.seat.LeatherSeat;
import edu.jalc.automobile.parts.body.seat.Seat;

public class TestLuxuryCabin{
  public void testGetSeat(){
    System.out.println("Testing getSeat() :: LuxuryCabin");
    LeatherSeat leatherSeat = new LeatherSeat("leatherseat");
    LuxurySeat luxurySeat = new LuxurySeat(leatherSeat);
     Seat seat = new Seat(luxurySeat);
     luxuryCabin = new LuxuryCabin(seat);
    assert(luxuryCabin.getSeat().equals("leatherseat"));
  }
  public static void main(String[] args){
    TestLuxuryCabin testLuxuryCabin = new TestLuxuryCabin();
    testLuxuryCabin.testGetSeat();
    System.out.println("Test Complete");
  }
}
