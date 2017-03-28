package edu.jalc.automobile.onlinebuilder.components.body.car;

import edu.jalc.automobile.parts.body.Cabin;
import edu.jalc.automobile.parts.body.EngineCompartment;
import edu.jalc.automobile.parts.body.Quarterpanels;
import edu.jalc.automobile.parts.body.StandardTrunk;

public class SedanBody extends CarBody {

   public SedanBody(Quarterpanels quarterpanels, EngineCompartment engineCompartment, Cabin cabin, StandardTrunk trunk){
      super(quarterpanels, engineCompartment, cabin, trunk);
   }
   public String toString(){
      return "SedanBody has :\n" +
                          "\t"+ getQuarterpanels() +"\n"+
                          "\t"+ getEngineCompartment()+"\n"+
                          "\t"+ getCabin()+"\n"+
                          "\t"+ getTrunk();
   }
    

}
