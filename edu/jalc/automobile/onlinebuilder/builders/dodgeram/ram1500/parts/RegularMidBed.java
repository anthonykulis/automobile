package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.MidBed;  

public class RegularMidBed extends MidBed{
   public  RegularMidBed(){super(6.4);}//truck bed is measured in feet not cubic feet!

   public String toString(){
      return "Cab and Box: Regular 6'4\"";
   }
}