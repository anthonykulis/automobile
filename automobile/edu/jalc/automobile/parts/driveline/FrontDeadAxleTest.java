package edu.jalc.automobile.parts.driveline;

public class FrontDeadAxleTest{

   protected void testToString(){
      System.out.println("Testing FrontDeadAxle::toString");
      FrontDeadAxle frontDeadAxle = new FrontDeadAxle();
      assert(frontDeadAxle.toString().equals("FrontDeadAxle"));
   }
   
   public static void main(String[] args){
      FrontDeadAxleTest test = new FrontDeadAxleTest();
      test.testToString();
      System.out.println("FrontDeadAxleTest compleat");
   } 
}