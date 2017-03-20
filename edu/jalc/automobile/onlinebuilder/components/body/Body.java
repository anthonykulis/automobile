package edu.jalc.automobile.onlinebuilder.components.body;

abstract public class Body{
  private Quarterpanels quarterpanels;
  private EngineCompartment engineCompartment;

  public Body(Quarterpanels quarterpanels, EngineCompartment engineCompartment){
    this.quarterpanels = quarterpanels;
    this.engineCompartment = engineCompartment;
  }

  public Quarterpanels getQuarterpanels(){
    return this.quarterpanels;
  }
  public EngineCompartment getEngineCompartment(){
    return this.engineCompartment;
  }
  abstract public Cabin getCabin(){}


}
