package edu.jalc.automobile.onlinebuilder.components.body.suv;
import edu.jalc.automobile.parts.body.StandardCabin;
import edu.jalc.automobile.parts.body.seat.ClothSeat;

public class TestEconomySuv{
  public void testGetCabin(){
    System.out.println("Testing getCabin() :: EconomySuvBody");
    StandardCabin standardCabin = new StandardCabin(new ClothSeat());
    EconomySuvBody economySuv = new EconomySuvBody(null,null,standardCabin,null);
    assert(economySuv.getCabin() == standardCabin);
  }

  public static void main(String[] args){
    TestEconomySuv testEconomy = new TestEconomySuv();
    testEconomy.testGetCabin();
    System.out.println("Test Complete");
  }
}
