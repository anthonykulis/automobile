package edu.jalc.automobile.onlinebuilder.components.body;
import edu.jalc.automobile.parts.Quarterpanels;
import edu.jalc.automobile.parts.EngineCompartment;
import edu.jalc.automobile.parts.Cabin;
import edu.jalc.automobile.parts.Trunk;

abstract public class Suv extends Body{

  public Suv(Quarterpanels quarterpanels, EngineCompartment engineCompartment,
                                Cabin cabin, StandardTrunk standardTrunk){
    super(quarterpanels, engineCompartment, cabin, standardTrunk);
  }
  private Suv(){
    super.quarterpanels = null;
    super.engineCompartment = null;
    super.cabin = null;
    this.standardTrunk = null;
  }

  public StandardTrunk getTrunk(){
    return (StandardTrunk) this.getTrunk();
  }



  }
}
