package edu.jalc.automobile.parts;
import edu.jalc.automobile.parts.Hood;

public class TestHood{
  public void testGetPaint(){
    System.out.println("Testing getPaint() :: Hood");
    Paint paint = new Paint("black");
    Hood hood = new Hood(paint,null);
    assert(hood.getPaint() == paint);
  }
  public void testGetGraphic(){
    System.out.println("Testing getGraphic() :: Hood");
    Graphic graphic = new Graphic("flames");
    Hood hood = new Hood(null,graphic);
    assert(hood.getGraphic() == graphic);
  }
  public static void main(String[] args){
    TestHood testHood = new TestHood();
    testHood.testGetPaint();
    testHood.testGetGraphic();
    System.out.println("Test Complete");
  }
}
