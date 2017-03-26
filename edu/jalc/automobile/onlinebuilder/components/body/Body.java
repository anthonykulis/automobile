package edu.jalc.automobile.onlinebuilder.components.body;

import edu.jalc.automobile.parts.body.Quarterpanels;
import edu.jalc.automobile.parts.body.EngineCompartment;
import edu.jalc.automobile.parts.body.Cabin;

abstract public class Body{

  private Quarterpanels quarterpanels;
  private EngineCompartment engineCompartment;
  private Cabin cabin;

  public Body(Quarterpanels quarterpanels, EngineCompartment engineCompartment, Cabin cabin){
    this.quarterpanels = quarterpanels;
    this.engineCompartment = engineCompartment;
    this.cabin = cabin;
  }

  public Quarterpanels getQuarterpanels(){
    return this.quarterpanels;
  }

  public EngineCompartment getEngineCompartment(){
    return this.engineCompartment;
  }

  public Cabin getCabin(){return cabin;}

}
