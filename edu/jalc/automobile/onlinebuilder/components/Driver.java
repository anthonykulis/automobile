package edu.jalc.automobile.onlinebuilder.components;

import java.util.ArrayList;
import edu.jalc.automobile.onlinebuilder.components.towing.*;
import edu.jalc.automobile.parts.*;

public class Driver{

   public static void main(String[] args){
      
      ArrayList<Suspension> order = new ArrayList<>();
      
      order.add(new TowingLightDuty(new SuperShock(), new LightSpring()));
      order.add(new SteelWheel(18, new AllTerrainTire(30,30)));
      
      for(Suspension s : order){
         System.out.println(s.toString());
      }
      

   }
}