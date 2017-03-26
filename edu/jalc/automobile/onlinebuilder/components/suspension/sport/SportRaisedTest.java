package edu.jalc.automobile.onlinebuilder.components.suspension.sport;


import edu.jalc.automobile.parts.suspension.ExtendedShocks;
import edu.jalc.automobile.parts.suspension.ExtendedSpring;

public class SportRaisedTest {

     public void testGetShock(){
        System.out.println("Testing SportRaised::getShock");
        ExtendedShocks shock = new ExtendedShocks();
        SportRaised sportRaised = new SportRaised(shock, null);
        assert(shock == sportRaised.getShock());
     }

     public void testGetSpring(){
        System.out.println("Testing SportRaised::getSpring");
        ExtendedSpring spring = new ExtendedSpring(10);
        SportRaised sportRaised = new SportRaised(null, spring);
        assert(spring == sportRaised.getSpring());
     }

     public static void main(String[] args){
        SportRaisedTest test = new SportRaisedTest();
        test.testGetShock();
        test.testGetSpring();
        System.out.println("All Tests for SportRaised Passed");
     }
}
