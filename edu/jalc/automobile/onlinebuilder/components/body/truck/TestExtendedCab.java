package edu.jalc.automobile.onlinebuilder.components.body.truck;

import edu.jalc.automobile.parts.body.LongBed;
import edu.jalc.automobile.parts.body.LuxuryCabin;
import edu.jalc.automobile.parts.body.seat.LeatherSeat;

public class TestExtendedCab{
  public void testGetTruckBed(){
    System.out.println("Testing getTruckBed() :: LongBed");
    LongBed longBed = new LongBed(3);
    ExtendedCab extendedCab = new ExtendedCab(null,null,null,longBed);
    assert(extendedCab.getTruckBed() == longBed);
  }
  public void testGetCabin(){
    System.out.println("Testing getCabin() :: LuxuryCabin");
    LuxuryCabin luxuryCabin = new LuxuryCabin(new LeatherSeat());
    ExtendedCab extendedCab = new ExtendedCab(null,null,luxuryCabin,null);
    assert(extendedCab.getCabin() == luxuryCabin);
  }
  public static void main(String[] args){
    TestExtendedCab testExtendedCab = new TestExtendedCab();
    testExtendedCab.testGetTruckBed();
    testExtendedCab.testGetCabin();
    System.out.println("Test Complete");
  }

}
