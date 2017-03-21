package edu.jalc.automobile.onlinebuilder.components;

import edu.jalc.automobile.onlinebuilder.components.towing.*;
import edu.jalc.automobile.parts.*;

public class Driver{

   public static void main(String[] args){
      
      Suspension tow = new TowingLightDuty(new SuperShock(), new HeavySpring(3));
      Wheel w = new SteelWheel(18, new AllTerrainTire(30, 30));
      
      System.out.println(tow.toString());
      System.out.println(w.toString());
   }
}