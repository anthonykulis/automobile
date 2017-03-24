package edu.jalc.automobile.onlinebuilder.components;

import edu.jalc.automobile.onlinebuilder.components.towing.*;
import edu.jalc.automobile.parts.*;

public class TestDriver{
   
   public static void main(String[] args){
      
      String[] arg = new String[1];
      
      System.out.println("Testing Suspension:\n");
      
      System.out.println("Testing Towing:\n");
      TowingSuperDutyTest.main(arg);
      TowingHeavyDutyTest.main(arg);
      TowingLightDutyTest.main(arg);
      System.out.println();
      
      System.out.println("Testing Spring:\n");
      SuperSpringTest.main(arg);
      HeavySpringTest.main(arg);
      LightSpringTest.main(arg);
      System.out.println();
      
      System.out.println("Testing Wheel:\n");
      SteelWheelTest.main(arg);
      System.out.println();
      
      System.out.println("Testing Tire:\n");
      AllTerrainTireTest.main(arg);
   }      
}