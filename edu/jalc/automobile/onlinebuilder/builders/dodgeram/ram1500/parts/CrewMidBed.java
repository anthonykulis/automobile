package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.MidBed;  

public class CrewMidBed extends MidBed{
   public  CrewMidBed(){super(6.4);}//truck bed is measured in feet not cubic feet!

   public String toString(){
      return "Cab and Box: Crew 6'4\"";
   }
}
