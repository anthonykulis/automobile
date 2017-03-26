package edu.jalc.automobile.onlinebuilder.components.body;

import edu.jalc.automobile.parts.body.Quarterpanels;
import edu.jalc.automobile.parts.body.EngineCompartment;
import edu.jalc.automobile.parts.body.Cabin;

abstract public class Body{
  Quarterpanels quarterpanels;
  EngineCompartment engineCompartment;
  Cabin cabin;

  public Body(Quarterpanels quarterpanels, EngineCompartment engineCompartment, Cabin cabin){
    this.setQuarterpanels(quarterpanels);
    this.setEngineCompartment(engineCompartment);
    this.cabin = cabin;
  }

  public Quarterpanels getQuarterpanels(){
    return this.quarterpanels;
  }

  Quarterpanels setQuarterpanels(Quarterpanels quarterpanels){
    this.quarterpanels = quarterpanels;
    return this.quarterpanels;
  }

  public EngineCompartment getEngineCompartment(){
    return this.engineCompartment;
  }

  EngineCompartment setEngineCompartment(EngineCompartment engineCompartment){
    this.engineCompartment = engineCompartment;
    return this.engineCompartment;
  }

  public Cabin getCabin(){return cabin;}

}
