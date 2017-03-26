package edu.jalc.automobile.parts.suspension;

public class AllTerrainTireTest{

   public void testGetHeight(){
      System.out.println("Testing AllTerrainTire::getHeight");
      AllTerrainTire tire = new AllTerrainTire(30, 0);
      assert(tire.getHeight() == 30);
   }
   
   public void testGetWidth(){
      System.out.println("Testing AllTerrainTire::getWidth");
      AllTerrainTire tire = new AllTerrainTire(0, 25);
      assert(tire.getWidth() == 25);
   }
   
   public static void main(String[] args){
      AllTerrainTireTest test = new AllTerrainTireTest();
      test.testGetHeight();
      test.testGetWidth();
      
      System.out.println("All Tests for AllTerrainTire Passed");
   }
   
}
      