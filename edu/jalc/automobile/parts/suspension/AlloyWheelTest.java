package edu.jalc.automobile.parts.suspension;

public class AlloyWheelTest{
   
   public void testGetSize(){
      System.out.println("Testing AlloyWheel::getWheel");
      AlloyWheel wheel = new AlloyWheel(18, null);
      assert(18 == wheel.getSize());
   }

   
   public static void main(String[] args){
      AlloyWheelTest test = new AlloyWheelTest();
      test.testGetSize();
      System.out.println("All Tests for AlloyWheel Passed");
   }
   
}