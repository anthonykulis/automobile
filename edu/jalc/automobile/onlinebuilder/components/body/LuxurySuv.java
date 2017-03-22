package edu.jalc.automobile.onlinebuilder.components.body;

public class LuxurySuv extends Suv{
  public LuxurySuv(Quarterpanels quarterpanels, EngineCompartment engineCompartment,
                                LuxuryCabin luxuryCabin, StandardTrunk standardTrunk){
    super(quarterpanels, engineCompartment, luxuryCabin, standardTrunk);
  }
  public LuxuryCabin getCabin(){
    return (LuxuryCabin) this.getCabin();
  }

  public String toString(){
    return "Adding LuxuryCabin to LuxurySuv";
  }
}
