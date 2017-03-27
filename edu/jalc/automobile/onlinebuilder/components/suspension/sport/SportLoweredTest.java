package edu.jalc.automobile.onlinebuilder.components.suspension.sport;


import edu.jalc.automobile.parts.suspension.ShortShocks;
import edu.jalc.automobile.parts.suspension.ShortSpring;
<<<<<<< HEAD:edu/jalc/automobile/onlinebuilder/components/suspension/sport/SportLoweredTest.java
import edu.jalc.automobile.parts.suspension.SportTire;
import edu.jalc.automobile.parts.suspension.Tire;
=======
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965:edu/jalc/automobile/onlinebuilder/components/suspension/sport/SportLoweredTest.java

public class SportLoweredTest {

     public void testGetShock(){
        System.out.println("Testing SportLowered::getShock");
        ShortShocks shock = new ShortShocks(3);
<<<<<<< HEAD:edu/jalc/automobile/onlinebuilder/components/suspension/sport/SportLoweredTest.java
        SportLowered sportLowered = new SportLowered(shock, null,null);
=======
        SportLowered sportLowered = new SportLowered(shock, null);
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965:edu/jalc/automobile/onlinebuilder/components/suspension/sport/SportLoweredTest.java
        assert(shock == sportLowered.getShock());
     }

     public void testGetSpring(){
        System.out.println("Testing SportLowered::getSpring");
        ShortSpring spring = new ShortSpring(2);
        SportLowered sportLowered = new SportLowered(null, spring,null);
        assert(spring == sportLowered.getSpring());
     }
    public void testGetTire(){
        System.out.println("Testing SportAdjustable::getTire");
        Tire tire = new SportTire(10,30);
        SportLowered sportLowered = new SportLowered(null, null,tire);
        assert(tire == sportLowered.getTire());
    }

    public static void main(String[] args){
        SportLoweredTest test = new SportLoweredTest();
        test.testGetShock();
        test.testGetSpring();
        test.testGetTire();
        System.out.println("All Tests for SportLowered Passed");
     }
}
