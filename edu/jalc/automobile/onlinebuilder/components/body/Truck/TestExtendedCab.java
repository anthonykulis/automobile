package automobile.edu.jalc.automobile.onlinebuilder.components.body.truck;

public class TestExtendedCab{
  public void testGetTruckBed(){
    System.out.println("Testing getTruckBed() :: LongBed");
    LongBed longBed = new LongBed();
    ExtendedCab extendedCab = new ExtendedCab(null,null,null,longBed);
    assert(extendedCab.getTruckBed() == longBed);
  }
  public void testGetCabin(){
    System.out.println("Testing getCabin() :: LuxuryCabin");
    LuxuryCabin luxuryCabin = new LuxuryCabin();
    ExtendedCab extendedCab = new ExtendedCab(null,null,luxuryCabin,null);
    assert(luxuryCabin.getCabin() == luxuryCabin);
  }
  public static void main(String[] args){
    TestExtendedCab testExtendedCab = new testExtendedCab();
    testExtendedCab.testGetTruckBed();
    testExtendedCab.testGetCabin();
    System.out.println("Test Complete");
  }

}
