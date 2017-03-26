package edu.jalc.automobile.onlinebuilder.components.body;
import edu.jalc.automobile.parts.body.StandardCabin;

public class TestEconomySuv{
  public void testGetCabin(){
    System.out.println("Testing getCabin() :: EconomySuv");
    StandardCabin standardCabin = new StandardCabin();
    EconomySuv economySuv = new EconomySuv(null,null,standardCabin,null);
    assert(economySuv.getCabin() == standardCabin);
  }

  public static void main(String[] args){
    TestEconomy testEconomy = new TestEconomy();
    testEconomy.testGetCabin();
    System.out.println("Test Complete");
  }
}
