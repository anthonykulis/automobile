package edu.jalc.automobile.parts.body;

import edu.jalc.automobile.parts.LuxurySeat;
<<<<<<< HEAD
import edu.jalc.automobile.parts.body.seat.LeatherSeat;
import edu.jalc.automobile.parts.body.seat.Seat;
=======
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965

public class TestLuxuryCabin{
  public void testGetSeat(){
    System.out.println("Testing getSeat() :: LuxuryCabin");
    LeatherSeat leatherSeat = new LeatherSeat("leatherseat");
    LuxurySeat luxurySeat = new LuxurySeat(leatherSeat);
<<<<<<< HEAD
     Seat seat = new Seat(luxurySeat);
     luxuryCabin = new LuxuryCabin(seat);
=======
    Seat seat = new Seat(luxurySeat);
    LuxuryCabin luxuryCabin = new LuxuryCabin(seat);
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965
    assert(luxuryCabin.getSeat().equals("leatherseat"));
  }
  public static void main(String[] args){
    TestLuxuryCabin testLuxuryCabin = new TestLuxuryCabin();
    testLuxuryCabin.testGetSeat();
    System.out.println("Test Complete");
  }
}
