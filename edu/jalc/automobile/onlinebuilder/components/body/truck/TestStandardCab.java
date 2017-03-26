package edu.jalc.automobile.onlinebuilder.components.body.truck;

import edu.jalc.automobile.parts.body.ShortBed;
import edu.jalc.automobile.parts.body.StandardCabin;
import edu.jalc.automobile.parts.body.seat.ClothSeat;

public class TestStandardCab{
  public void testGetTruckBed(){
    System.out.println("Testing getTruckBed() :: ShortBed");
    ShortBed shortBed = new ShortBed(3.0);
    StandardCab standardCab = new StandardCab(null,null,null,shortBed);
    assert(standardCab.getTruckBed() == shortBed);
  }
  public void testGetCabin(){
    System.out.println("Testing getCabin() :: StandardCabin");
    StandardCabin standardCabin = new StandardCabin(new ClothSeat());
    StandardCab standardCab = new StandardCab(null,null,standardCabin,null);
    assert(standardCab.getCabin() == standardCabin);
  }
  public static void main(String[] args){
    TestStandardCab testStandardCab = new TestStandardCab();
    testStandardCab.testGetTruckBed();
    testStandardCab.testGetCabin();
    System.out.println("Test Complete");
  }

}
