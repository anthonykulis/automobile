package edu.jalc.automobile.onlinebuilder.components.body.truck;

import edu.jalc.automobile.parts.body.LuxuryCabin;
import edu.jalc.automobile.parts.body.ShortBed;

public class TestCrewCab{
  public void testGetTruckBed(){
    System.out.println("Testing getTruckBed() :: ShortBed");
    ShortBed shortBed = new ShortBed();
    edu.jalc.automobile.onlinebuilder.components.body.truck.CrewCab crewCab = new edu.jalc.automobile.onlinebuilder.components.body.truck.CrewCab(null,null,null,shortBed);
    assert(crewCab.getTruckBed() == shortBed);
  }
  public void testGetCabin(){
    System.out.println("Testing getCabin() :: LuxuryCabin");
    LuxuryCabin luxuryCabin = new LuxuryCabin();
    edu.jalc.automobile.onlinebuilder.components.body.truck.CrewCab crewCab = new edu.jalc.automobile.onlinebuilder.components.body.truck.CrewCab(null,null,luxuryCabin,null);
    assert(luxuryCabin.getCabin() == luxuryCabin);
  }
  public static void main(String[] args){
    TestCrewCab testCrewCab = new testCrewCab();
    testCrewCab.testGetTruckBed();
    testCrewCab.testGetCabin();
    System.out.println("Test Complete");
  }

}
