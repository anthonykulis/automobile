package edu.jalc.automobile.onlinebuilder.components.body.truck;

import edu.jalc.automobile.parts.body.ShortBed;
import edu.jalc.automobile.parts.body.StandardCabin;

public class TestStandardCab{
  public void testGetTruckBed(){
    System.out.println("Testing getTruckBed() :: ShortBed");
    ShortBed shortBed = new ShortBed();
    edu.jalc.automobile.onlinebuilder.components.body.truck.StandardCab standardCab = new edu.jalc.automobile.onlinebuilder.components.body.truck.StandardCab(null,null,null,shortBed);
    assert(standardCab.getTruckBed() == shortBed);
  }
  public void testGetCabin(){
    System.out.println("Testing getCabin() :: StandardCabin");
    StandardCabin standardCabin = new StandardCabin();
    edu.jalc.automobile.onlinebuilder.components.body.truck.StandardCab standardCab = new edu.jalc.automobile.onlinebuilder.components.body.truck.StandardCab(null,null,standardCabin,null);
    assert(standardCabin.getCabin() == standardCabin);
  }
  public static void main(String[] args){
    TestStandardCab testStandardCab = new testStandardCab();
    testStandardCab.testGetTruckBed();
    testStandardCab.testGetCabin();
    System.out.println("Test Complete");
  }

}
