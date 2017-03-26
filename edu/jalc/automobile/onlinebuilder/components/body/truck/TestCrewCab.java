package edu.jalc.automobile.onlinebuilder.components.body.truck;

import edu.jalc.automobile.parts.body.LuxuryCabin;
import edu.jalc.automobile.parts.body.ShortBed;
import edu.jalc.automobile.parts.body.seat.LeatherSeat;

public class TestCrewCab{
  public void testGetTruckBed(){
    System.out.println("Testing getTruckBed() :: ShortBed");
    ShortBed shortBed = new ShortBed(3);
    CrewCab crewCab = new CrewCab(null,null,null,shortBed);
    assert(crewCab.getTruckBed() == shortBed);
  }
  public void testGetCabin(){
    System.out.println("Testing getCabin() :: LuxuryCabin");
    LuxuryCabin luxuryCabin = new LuxuryCabin(new LeatherSeat());
    CrewCab crewCab = new CrewCab(null,null,luxuryCabin,null);
    assert(crewCab.getCabin() == luxuryCabin);
  }
  public static void main(String[] args){
    TestCrewCab testCrewCab = new TestCrewCab();
    testCrewCab.testGetTruckBed();
    testCrewCab.testGetCabin();
    System.out.println("Test Complete");
  }

}
