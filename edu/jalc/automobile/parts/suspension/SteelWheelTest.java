package jalc.automobile.parts.suspension;

public class SteelWheelTest{
   
   public void testGetSize(){
      System.out.println("Testing SteelWheel::getWheel");
      SteelWheel wheel = new SteelWheel(18, null);
      assert(18 == wheel.getSize());
   }
   
   public void testGetTire(){
      System.out.println("Testing SteelWheel::getTire");
      Tire tire = new AllTerrainTire(30, 30);
      SteelWheel wheel = new SteelWheel(0, tire);
      assert(tire == wheel.getTire());
   }
   
   public static void main(String[] args){
      SteelWheelTest test = new SteelWheelTest();
      test.testGetSize();
      test.testGetTire();
      System.out.println("All Tests for SteelWheel Passed");
   }
   
}