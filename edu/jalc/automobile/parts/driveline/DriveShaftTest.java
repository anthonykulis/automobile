package edu.jalc.automobile.parts.driveline;

public class DriveShaftTest{

   protected void testToString(){
      System.out.println("Testing DriveShaft::toString");
      DriveShaft driveShaft = new DriveShaft();
      assert(driveShaft.toString().equals("DriveShaft"));
   }
   
   public static void main(String[] args){
      DriveShaftTest test = new DriveShaftTest();
      test.testToString();
      System.out.println("DriveShaftTest compleat");
   } 
}