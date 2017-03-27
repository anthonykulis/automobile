package edu.jalc.automobile.parts.driveline;

public class OpenDifferentialTest{

   protected void testToString(){
      System.out.println("Testing OpenDifferential::toString");
      OpenDifferential openDifferential = new OpenDifferential();
      assert(openDifferential.toString().equals("OpenDifferential"));
   }
   
   public static void main(String[] args){
      OpenDifferentialTest test = new OpenDifferentialTest();
      test.testToString();
      System.out.println("OpenDifferentialTest compleat");
   } 
}