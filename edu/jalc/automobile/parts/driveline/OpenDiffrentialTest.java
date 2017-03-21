package edu.jalc.automobile.parts.driveline;

public class OpenDiffrentialTest{

   protected void testToString(){
      System.out.println("Testing OpenDiffrential::toString");
      OpenDiffrential openDiffrential = new OpenDiffrential();
      assert(openDiffrential.toString().equals("OpenDiffrential"));
   }
   
   public static void main(String[] args){
      OpenDiffrentialTest test = new OpenDiffrentialTest();
      test.testToString();
      System.out.println("OpenDiffrentialTest compleat");
   } 
}