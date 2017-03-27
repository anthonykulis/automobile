package edu.jalc.automobile.parts.driveline;

public class RearDriveAxleTest{

   protected void testToString(){
      System.out.println("Testing RearDriveAxle::toString");
      RearDriveAxle rearDriveAxle = new RearDriveAxle();
      assert(rearDriveAxle.toString().equals("RearDriveAxle"));
   }
   
   public static void main(String[] args){
      RearDriveAxleTest test = new RearDriveAxleTest();
      test.testToString();
      System.out.println("RearDriveAxleTest compleat");
   } 
}