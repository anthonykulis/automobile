package edu.jalc.automobile.parts.driveline;

public class FourWheelDriveAxleTest{

   protected void testToString(){
      System.out.println("Testing FourWheelDriveAxle::toString");
      FourWheelDriveAxle fourWheelDriveAxle = new FourWheelDriveAxle();
      assert(fourWheelDriveAxle.toString().equals("FourWheelDriveAxle"));
   }
   
   public static void main(String[] args){
      FourWheelDriveAxleTest test = new FourWheelDriveAxleTest();
      test.testToString();
      System.out.println("FourWheelDriveAxleTest compleat");
   } 
}