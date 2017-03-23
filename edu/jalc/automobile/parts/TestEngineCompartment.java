package edu.jalc.automobile.parts;


public class TestEngineCompartment{
  public void testGetHood(){
    System.out.println("Testing getHood() :: EngineCompartment");
    Paint paint = new Paint("black");
    Graphic graphic = new Graphic("flames");
    Hood hood = new Hood(paint, graphic);
    EngineCompartment eC = new EngineCompartment(hood);
    assert(eC.getHood() == hood);
  }
  public static void main(String[] args){
    TestEngineCompartment tEC = new TestEngineCompartment();
    tEC.testGetHood();
    System.out.println("Test Complete");
  }
}
