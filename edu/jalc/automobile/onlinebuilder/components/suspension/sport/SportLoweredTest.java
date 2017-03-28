package edu.jalc.automobile.onlinebuilder.components.suspension.sport;


import edu.jalc.automobile.parts.suspension.*;

public class SportLoweredTest {

     public void testGetShock(){
        System.out.println("Testing SportLowered::getShock");
        ShortShocks shock = new ShortShocks(3);
        SportLowered sportLowered = new SportLowered(shock, null,null,null);
        assert(shock == sportLowered.getShock());
     }

     public void testGetSpring(){
        System.out.println("Testing SportLowered::getSpring");
        ShortSpring spring = new ShortSpring(2);
        SportLowered sportLowered = new SportLowered(null, spring,null,null);
        assert(spring == sportLowered.getSpring());
     }
    public void testGetTire(){
        System.out.println("Testing SportAdjustable::getTire");
        SportTire tire = new SportTire(10,30);
        SportLowered sportLowered = new SportLowered(null, null,tire,null);
        assert(tire == sportLowered.getTire());
    }
    public void testGetWheel() {
        System.out.println("Testing SportLowered::getWheel");
        ForgedWheel forgedWheel = new ForgedWheel(16);
        SportLowered sportLowered = new SportLowered(null,null,null,forgedWheel);

        assert (forgedWheel == sportLowered.getForgedWheel());
    }

    public static void main(String[] args){
        SportLoweredTest test = new SportLoweredTest();
        test.testGetShock();
        test.testGetSpring();
        test.testGetTire();
        test.testGetWheel();
        System.out.println("All Tests for SportLowered Passed");
     }
}
