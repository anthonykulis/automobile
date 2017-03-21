package edu.jalc.automobile.onlinebuilder.components;

import edu.jalc.automobile.onlinebuilder.components.towing.*;
import edu.jalc.automobile.parts.*;

public class Driver{

   public static void main(String[] args){
      
      Suspension tow = new TowingHeavyDuty(new SuperShock(), new LightSpring());
      
      System.out.println(tow.toString());
   }
}