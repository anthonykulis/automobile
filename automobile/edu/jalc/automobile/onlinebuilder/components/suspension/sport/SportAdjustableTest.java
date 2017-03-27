package edu.jalc.automobile.onlinebuilder.components.suspension.sport;


import edu.jalc.automobile.parts.suspension.AdjustableShocks;
import edu.jalc.automobile.parts.suspension.MediumSpring;
import edu.jalc.automobile.parts.suspension.SportTire;
import edu.jalc.automobile.parts.suspension.Tire;

public class SportAdjustableTest {

     public void testGetShock(){
        System.out.println("Testing SportAdjustable::getShock");
        AdjustableShocks shock = new AdjustableShocks(10);
        SportAdjustable sportAdjustable = new SportAdjustable(shock, null,null);
        assert(shock == sportAdjustable.getShock());
     }

     public void testGetSpring(){
        System.out.println("Testing SportAdjustable::getSpring");
        MediumSpring spring = new MediumSpring(10);
        SportAdjustable sportAdjustable = new SportAdjustable(null, spring,null);
        assert(spring == sportAdjustable.getSpring());
     }
    public void testGetTire(){
        System.out.println("Testing SportAdjustable::getTire");
        Tire tire = new SportTire(10,30);
        SportAdjustable sportAdjustable = new SportAdjustable(null, null,tire);
        assert(tire == sportAdjustable.getTire());
    }

     public static void main(String[] args) {
         SportAdjustableTest test = new SportAdjustableTest();
         test.testGetShock();
         test.testGetSpring();
         test.testGetTire();
         System.out.println("All Tests for SportAdjustable Passed");
     }
}
