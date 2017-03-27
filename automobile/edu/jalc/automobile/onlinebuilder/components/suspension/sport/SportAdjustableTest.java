package edu.jalc.automobile.onlinebuilder.components.suspension.sport;


import edu.jalc.automobile.parts.suspension.*;

public class SportAdjustableTest {

     public void testGetShock(){
        System.out.println("Testing SportAdjustable::getShock");
        AdjustableShocks shock = new AdjustableShocks(10);
        SportAdjustable sportAdjustable = new SportAdjustable(shock, null,null,null);
        assert(shock == sportAdjustable.getShock());
     }

     public void testGetSpring(){
        System.out.println("Testing SportAdjustable::getSpring");
        MediumSpring spring = new MediumSpring(10);
        SportAdjustable sportAdjustable = new SportAdjustable(null, spring,null,null);
        assert(spring == sportAdjustable.getSpring());
     }
    public void testGetTire(){
        System.out.println("Testing SportAdjustable::getTire");
        SportTire tire = new SportTire(10,30);
        SportAdjustable sportAdjustable = new SportAdjustable(null, null,tire,null);
        assert(tire == sportAdjustable.getTire());
    }
    public void testGetWheel() {
        System.out.println("Testing SportAdjustable::getWheel");
        ForgedWheel forgedWheel = new ForgedWheel(16);
        SportAdjustable sportAdjustable = new SportAdjustable(null,null,null,forgedWheel);

        assert (forgedWheel.getSize() == sportAdjustable.getForgedWheel().getSize());
    }

     public static void main(String[] args) {
         SportAdjustableTest test = new SportAdjustableTest();
         test.testGetShock();
         test.testGetSpring();
         test.testGetTire();
         test.testGetWheel();
         System.out.println("All Tests for SportAdjustable Passed");
     }
}
