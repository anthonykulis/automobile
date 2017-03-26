package edu.jalc.automobile.onlinebuilder.components.suspension.sport;


import edu.jalc.automobile.parts.suspension.ShortShocks;
import edu.jalc.automobile.parts.suspension.ShortSpring;

public class SportLoweredTest {

     public void testGetShock(){
        System.out.println("Testing SportLowered::getShock");
        ShortShocks shock = new ShortShocks();
        SportLowered sportLowered = new SportLowered(shock, null);
        assert(shock == sportLowered.getShock());
     }

     public void testGetSpring(){
        System.out.println("Testing SportLowered::getSpring");
        ShortSpring spring = new ShortSpring(2);
        SportLowered sportLowered = new SportLowered(null, spring);
        assert(spring == sportLowered.getSpring());
     }

     public static void main(String[] args){
        SportLoweredTest test = new SportLoweredTest();
        test.testGetShock();
        test.testGetSpring();
        System.out.println("All Tests for SportLowered Passed");
     }
}
