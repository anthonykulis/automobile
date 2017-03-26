package jalc.automobile.parts.suspension;

public class LightSpringTest{

   public void testGetHeight(){
      System.out.println("Testing LighttSpring::getHeight");
      LightSpring spring = new LightSpring();
      assert(8 == spring.getHeight());
   }
   
   public static void main(String[] args){
      LightSpringTest test = new LightSpringTest();
      test.testGetHeight();
      System.out.println("All Tests for LightSpring Passed");
   }
}