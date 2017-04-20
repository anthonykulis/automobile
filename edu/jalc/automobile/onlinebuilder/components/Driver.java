package edu.jalc.automobile.onlinebuilder.components;

import java.util.ArrayList;

import edu.jalc.automobile.onlinebuilder.components.suspension.Suspension;
import edu.jalc.automobile.onlinebuilder.components.suspension.towing.TowingSuperDuty;

import edu.jalc.automobile.parts.*;
import edu.jalc.automobile.parts.suspension.SuperShock;
import edu.jalc.automobile.parts.suspension.SuperSpring;

public class Driver{

   public static void main(String[] args){
      
      ArrayList<Suspension> order = new ArrayList<>();
      
      order.add(new TowingSuperDuty(new SuperShock(0),new SuperSpring(0),null,null));
      
      for(Suspension s : order){
         System.out.println(s.toString());
      }
      

   }
}