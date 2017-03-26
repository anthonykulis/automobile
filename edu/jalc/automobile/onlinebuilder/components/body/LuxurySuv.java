package edu.jalc.automobile.onlinebuilder.components.body;

import edu.jalc.automobile.parts.body.EngineCompartment;
import edu.jalc.automobile.parts.body.LuxuryCabin;
import edu.jalc.automobile.parts.body.Quarterpanels;
import edu.jalc.automobile.parts.body.StandardTrunk;

public class LuxurySuv extends Suv{
  public LuxurySuv(Quarterpanels quarterpanels, EngineCompartment engineCompartment,
                                LuxuryCabin luxuryCabin, StandardTrunk standardTrunk){
    super(quarterpanels, engineCompartment, luxuryCabin, standardTrunk);
  }
  public LuxuryCabin getCabin(){
    return (LuxuryCabin) this.getCabin();
  }

  public String toString(){
    return "LuxurySuv has :\n" +
                    "\t"+ getQuarterpanels()+"\n"+
                    "\t"+ getEngineCompartment()+"\n"+
                    "\t"+ getCabin();
  }
}
