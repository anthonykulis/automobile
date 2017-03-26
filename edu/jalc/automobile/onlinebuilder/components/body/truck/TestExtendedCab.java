package edu.jalc.automobile.onlinebuilder.components.body.truck;

import edu.jalc.automobile.parts.body.LongBed;
import edu.jalc.automobile.parts.body.LuxuryCabin;

public class TestExtendedCab{
  public void testGetTruckBed(){
    System.out.println("Testing getTruckBed() :: LongBed");
    LongBed longBed = new LongBed();
    edu.jalc.automobile.onlinebuilder.components.body.truck.ExtendedCab extendedCab = new edu.jalc.automobile.onlinebuilder.components.body.truck.ExtendedCab(null,null,null,longBed);
    assert(extendedCab.getTruckBed() == longBed);
  }
  public void testGetCabin(){
    System.out.println("Testing getCabin() :: LuxuryCabin");
    LuxuryCabin luxuryCabin = new LuxuryCabin();
    edu.jalc.automobile.onlinebuilder.components.body.truck.ExtendedCab extendedCab = new edu.jalc.automobile.onlinebuilder.components.body.truck.ExtendedCab(null,null,luxuryCabin,null);
    assert(luxuryCabin.getCabin() == luxuryCabin);
  }
  public static void main(String[] args){
    TestExtendedCab testExtendedCab = new testExtendedCab();
    testExtendedCab.testGetTruckBed();
    testExtendedCab.testGetCabin();
    System.out.println("Test Complete");
  }

}
