package edu.jalc.automobile.parts.body;

public class TestGraphic{
  public void testGetGraphic(){
    System.out.println("Testing getGraphic :: Graphic");
    Graphic graphic = new Graphic();
    assert(graphic.toString().equals("stripes"));
  }

  public static void main(String[] args){
    TestGraphic testGraphic = new TestGraphic();
    testGraphic.testGetGraphic();
    System.out.println("Test complete");
  }

}
