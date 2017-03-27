package edu.jalc.automobile.parts.driveline;

public class LockingDifferentialTest{

   protected void testToString(){
      System.out.println("Testing LockingDifferential::toString");
      LockingDifferential lockingDifferential = new LockingDifferential();
      assert(lockingDifferential.toString().equals("LockingDifferential"));
   }
   
   public static void main(String[] args){
      LockingDifferentialTest test = new LockingDifferentialTest();
      test.testToString();
      System.out.println("LockingDifferentialTest compleat");
   } 
}