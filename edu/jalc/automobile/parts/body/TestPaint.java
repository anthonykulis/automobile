package edu.jalc.automobile.parts.body;

public class TestPaint{
  public void testGetPaint(){
    System.out.println("Testing getPaint :: Paint");
    Paint paint = new Paint();
    paint.name = "black";

    assert(paint.getName().equals("black"));

  }

  public static void main(String[] args){
    TestPaint testPaint = new TestPaint();
    testPaint.testGetPaint();
    System.out.println("Test complete");
  }

}
