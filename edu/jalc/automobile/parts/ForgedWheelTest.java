public class ForgedWheelTest {
  public void testGetSize(){
     System.out.println("Testing ForgedWheel::getHeight");
     ForgedWheel forgedWheel = new ForgedWheel(30);
     assert(shortSpring.getSize() == 30);
  }

  public static void main(String[] args){
     ShortSpring test = new ShortSpring();
     test.testGetHeight();

     System.out.println("All Tests for ForgedWheel Passed");
  }

}
