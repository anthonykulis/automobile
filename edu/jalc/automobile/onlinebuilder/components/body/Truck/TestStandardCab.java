package automobile.edu.jalc.automobile.onlinebuilder.components.body.truck;

public class TestStandardCab{
  public void testGetTruckBed(){
    System.out.println("Testing getTruckBed() :: ShortBed");
    ShortBed shortBed = new ShortBed();
    StandardCab standardCab = new StandardCab(null,null,null,shortBed);
    assert(standardCab.getTruckBed() == shortBed);
  }
  public void testGetCabin(){
    System.out.println("Testing getCabin() :: StandardCabin");
    StandardCabin standardCabin = new StandardCabin();
    StandardCab standardCab = new StandardCab(null,null,standardCabin,null);
    assert(standardCabin.getCabin() == standardCabin);
  }
  public static void main(String[] args){
    TestStandardCab testStandardCab = new testStandardCab();
    testStandardCab.testGetTruckBed();
    testStandardCab.testGetCabin();
    System.out.println("Test Complete");
  }

}
