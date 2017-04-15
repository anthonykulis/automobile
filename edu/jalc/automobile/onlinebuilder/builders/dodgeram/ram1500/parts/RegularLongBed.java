package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts;
import  edu.jalc.automobile.parts.body.LongBed;

public class RegularLongBed extends MidBed{
   public  RegularLongBed(){super(8.0);}//truck bed is measured in feet not cubic feet!

   public String toString(){
      return "Cab and Box: Regular 8'";
   }
}