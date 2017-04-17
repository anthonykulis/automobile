package edu.jalc.automobile.onlinebuilder.components.body.suv;

import edu.jalc.automobile.parts.body.*;

public class LuxurySuvBody extends SuvBody {
  public LuxurySuvBody(Quarterpanels quarterpanels, EngineCompartment engineCompartment,
                       LuxuryCabin luxuryCabin, Hatchback hatchback){
    super(quarterpanels, engineCompartment, luxuryCabin, hatchback);
  }
  public LuxuryCabin getCabin(){
    return (LuxuryCabin) this.getCabin();
  }

  public String toString(){
    return "LuxurySuvBody has :\n" +
                    "\t"+ getQuarterpanels()+"\n"+
                    "\t"+ getEngineCompartment()+"\n"+
                    "\t"+ getCabin();
  }
}
