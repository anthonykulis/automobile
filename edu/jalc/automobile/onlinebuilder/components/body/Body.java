package edu.jalc.automobile.onlinebuilder.components.body;

import edu.jalc.automobile.parts.Quarterpanels;
import edu.jalc.automobile.parts.EngineCompartment;
import edu.jalc.automobile.parts.Cabin;

abstract public class Body{
  private Quarterpanels quarterpanels;
  private EngineCompartment engineCompartment;
  private Cabin cabin;
  private Trunk trunk;

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

  abstract public Cabin getCabin(){}

  abstract public Trunk getTrunk(){}

  public String toString(){
    return "Added Quarterpanels and EngineCompartment";
  }
}
