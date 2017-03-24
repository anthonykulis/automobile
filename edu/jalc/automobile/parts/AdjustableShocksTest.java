package edu.jalc.automobile.parts;

public class AdjustableShocksTest {
   public void testGetHeight(){
      System.out.println("Testing AdjustableShocksTest::getHeight");
      AdjustableShocks adjustableShocks = new AdjustableShocks(30);
      assert(adjustableShocks.getHeight() == 30);
   }


   public static void main(String[] args){
      AdjustableShocksTest test = new AdjustableShocksTest();
      test.testGetHeight();

      System.out.println("All Tests for AdjustableShocksTest Passed");
   }
}
