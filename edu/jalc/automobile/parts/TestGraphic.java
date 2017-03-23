package edu.jalc.automobile.parts;

public class TestGraphic{
  public void testGetGraphic(){
    System.out.println("Testing getGraphic :: Graphic");
    Graphic graphic = new Graphic("stripes");
    assert(graphic.getGraphic().equals("stripes"));
  }

  public static void main(String[] args){
    TestGraphic testGraphic = new TestGraphic();
    testGraphic.testGetGraphic();
    System.out.println("Test complete");
  }

}
