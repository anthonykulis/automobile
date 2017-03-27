package edu.jalc.automobile.onlinebuilder.components.suspension.sport;


import edu.jalc.automobile.parts.suspension.ExtendedShocks;
import edu.jalc.automobile.parts.suspension.ExtendedSpring;
import edu.jalc.automobile.parts.suspension.SportTire;
import edu.jalc.automobile.parts.suspension.Tire;

public class SportRaisedTest {

     public void testGetShock(){
        System.out.println("Testing SportRaised::getShock");
        ExtendedShocks shock = new ExtendedShocks(3);
        SportRaised sportRaised = new SportRaised(shock, null,null);
        assert(shock == sportRaised.getShock());
     }

     public void testGetSpring(){
        System.out.println("Testing SportRaised::getSpring");
        ExtendedSpring spring = new ExtendedSpring(10);
        SportRaised sportRaised = new SportRaised(null, spring,null);
        assert(spring == sportRaised.getSpring());
     }
    public void testGetTire(){
        System.out.println("Testing SportAdjustable::getTire");
        Tire tire = new SportTire(10,30);
        SportRaised sportRaised = new SportRaised(null, null,tire);

        assert(tire == sportRaised.getTire());
    }

    public static void main(String[] args){
        SportRaisedTest test = new SportRaisedTest();
        test.testGetShock();
        test.testGetSpring();
        test.testGetTire();
        System.out.println("All Tests for SportRaised Passed");
     }
}
