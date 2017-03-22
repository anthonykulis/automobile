package edu.jalc.automobile.onlinebuilder.components.sport;

import edu.jalc.automobile.parts.*;


public class SportAdjustableTest {

     public void testGetShock(){
        System.out.println("Testing SportAdjustable::getShock");
        AdjustableShocks shock = new AdjustableShocks();
        SportAdjustable sportAdjustable = new SportAdjustable(shock, null);
        assert(shock == sportAdjustable.getShock());
     }

     public void testGetSpring(){
        System.out.println("Testing SportAdjustable::getSpring");
        MediumSpring spring = new MediumSpring();
        SportAdjustable sportAdjustable = new SportAdjustable(null, spring);
        assert(spring == sportAdjustable.getSpring());
     }

     public static void main(String[] args){
        SportAdjustableTest test = new SportAdjustableTest();
        test.testGetShock();
        test.testGetSpring();
        System.out.println("All Tests for SportAdjustable Passed");
     }
}
