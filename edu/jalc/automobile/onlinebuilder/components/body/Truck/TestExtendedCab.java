package automobile.edu.jalc.automobile.onlinebuilder.components.body.truck;

public class TestExtendedCab{
  public void testGetTruckBed(){
    System.out.println("Testing getTruckBed() :: LongBed");
    LongBed longBed = new LongBed(1.1);
    assert(longBed.getTruckBed() == 1.1);
  }
  public void testGetCabin(){
    System.out.println("Testing getCabin() :: LuxuryCabin");
    LuxuryCabin luxuryCabin = new LuxuryCabin();
  }


}
