package edu.jalc.automobile.parts;
public class AdjustableShocksTest {
   public void testGetHeight(){
      System.out.println("Testing AdjustableShocksTest::getHeight");
      AdjustableShocksTest adjustableShocksTest = new AdjustableShocksTest(30);
      assert(adjustableShocksTest.getHeight() == 30);
   }


   public static void main(String[] args){
      AdjustableShocksTest test = new AdjustableShocksTest();
      test.testGetHeight();

      System.out.println("All Tests for AdjustableShocksTest Passed");
   }

}
