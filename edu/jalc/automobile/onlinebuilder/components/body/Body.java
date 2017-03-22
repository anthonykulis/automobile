package edu.jalc.automobile.onlinebuilder.components.body;

import edu.jalc.automobile.parts.Quarterpanels;
import edu.jalc.automobile.parts.EngineCompartment;
import edu.jalc.automobile.parts.Cabin;

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

  public Cabin getCabin(){return cabin}


  public String toString(){
    return "Added Quarterpanels and EngineCompartment";
  }
}
