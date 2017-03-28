package edu.jalc.automobile.onlinebuilder.components;

import java.util.ArrayList;
import edu.jalc.automobile.onlinebuilder.components.towing.*;
import edu.jalc.automobile.onlinebuilder.components.economy.*;
import edu.jalc.automobile.onlinebuilder.components.sport.*;
import edu.jalc.automobile.parts.*;

public class Driver{

   public static void main(String[] args){
      
      ArrayList<Suspension> order = new ArrayList<>();
      
      order.add(new TowingSuperDuty(new SuperShock(),new SuperSpring()));
      
      for(Suspension s : order){
         System.out.println(s.toString());
      }
      

   }
}