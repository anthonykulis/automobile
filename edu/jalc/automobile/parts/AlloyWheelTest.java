package edu.jalc.automobile.parts;

public class AlloyWheelTest{
   
   public void testGetSize(){
      System.out.println("Testing AlloyWheel::getWheel");
      AlloyWheel wheel = new AlloyWheel(18, null);
      assert(18 == wheel.getSize());
   }
   
   public void testGetTire(){
      System.out.println("Testing AlloyWheel::getTire");
      Tire tire = new EconomyTire(30, 30);
      AlloyWheel wheel = new AlloyWheel(0, tire);
      assert(tire == wheel.getTire());
   }
   
   public static void main(String[] args){
      AlloyWheelTest test = new AlloyWheelTest();
      test.testGetSize();
      test.testGetTire();
      System.out.println("All Tests for AlloyWheel Passed");
   }
   
}