package edu.jalc.automobile.parts.body;

public class TestQuarterpanels{
  public void testGetPaint(){
    System.out.println("Testing getPaint() :: Quarterpanels");
    Paint paint = new Paint("black");
    Quarterpanels quarterpanels = new Quarterpanels(paint,null);
    assert(quarterpanels.getPaint() == paint);
  }
  public void testGetGraphic(){
    System.out.println("Testing getGraphic() :: Quarterpanels");
    Graphic graphic = new Graphic("flames");
    Quarterpanels quarterpanels = new Quarterpanels(null,graphic);
    assert(quarterpanels.getGraphic() == graphic);
  }
  public static void main(String[] args){
    TestQuarterpanels testQuarterpanels = new TestQuarterpanels();
    testQuarterpanels.testGetPaint();
    testQuarterpanels.testGetGraphic();
    System.out.println("Test Complete");
  }
}
