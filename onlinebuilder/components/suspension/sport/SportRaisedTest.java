package edu.jalc.automobile.onlinebuilder.components.suspension.sport;


import edu.jalc.automobile.parts.suspension.*;

public class SportRaisedTest {

     public void testGetShock(){
        System.out.println("Testing SportRaised::getShock");
        ExtendedShocks shock = new ExtendedShocks(3);
        SportRaised sportRaised = new SportRaised(shock, null,null,null);
        assert(shock == sportRaised.getShock());
     }

     public void testGetSpring(){
        System.out.println("Testing SportRaised::getSpring");
        ExtendedSpring spring = new ExtendedSpring(10);
        SportRaised sportRaised = new SportRaised(null, spring,null,null);
        assert(spring == sportRaised.getSpring());
     }
    public void testGetTire(){
        System.out.println("Testing SportAdjustable::getTire");
        SportTire tire = new SportTire(10,30);
        SportRaised sportRaised = new SportRaised(null, null,tire,null);

        assert(tire == sportRaised.getTire());
    }
    public void testGetWheel() {
        System.out.println("Testing SportRaised::getWheel");
        ForgedWheel forgedWheel = new ForgedWheel(16);
        SportRaised sportRaised = new SportRaised(null,null,null,forgedWheel);

        assert (forgedWheel == sportRaised.getForgedWheel());
    }


    public static void main(String[] args){
        SportRaisedTest test = new SportRaisedTest();
        test.testGetShock();
        test.testGetSpring();
        test.testGetTire();
        test.testGetWheel();
        System.out.println("All Tests for SportRaised Passed");
     }
}
