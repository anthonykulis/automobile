package edu.jalc.automobile.parts.driveline;

public class ElectricSteeringTest{

   protected void testToString(){
      System.out.println("Testing ElectricSteering::toString");
      ElectricSteering electricSteering = new ElectricSteering();
      assert(electricSteering.toString().equals("ElectricSteering"));
   }
   
   public static void main(String[] args){
      ElectricSteeringTest test = new ElectricSteeringTest();
      test.testToString();
      System.out.println("ElectricSteeringTest compleat");
   } 
}