package edu.jalc.automobile.parts;

public class TestQuarterpanel{
  public void testGetPaint(){
    System.out.println("Testing getPaint() :: Quarterpanel");
    Paint paint = new Paint("black");
    Quarterpanel quarterpanel = new Quarterpanel(paint,null);
    assert(quarterpanel.getPaint() == paint);
  }
  public void testGetGraphic(){
    System.out.println("Testing getGraphic() :: Quarterpanel");
    Graphic graphic = new Graphic("flames");
    Quarterpanel quarterpanel = new Quarterpanel(null,graphic);
    assert(quarterpanel.getGraphic() == graphic);
  }
  public static void main(String[] args){
    TestQuarterpanel testQuarterpanel = new TestQuarterpanel();
    testQuarterpanel.testGetPaint();
    testQuarterpanel.testGetGraphic();
    System.out.println("Test Complete");
  }
}
