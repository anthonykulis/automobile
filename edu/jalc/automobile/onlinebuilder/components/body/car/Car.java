package edu.jalc.automobile.onlinebuilder.components.body;

abstract public class Car extends Body{

  private Trunk trunk;

  public Car( Quarterpanels quarterpanels, EngingeCompartment engineCompartment,
    Cabin cabin, StandardTrunk standardTrunk){
      super(quarterpanels, engineCompartment, cabin, standardTrunk);
    }
  abstract public Trunk getTrunk();
  abstract public Cabin getCabin();
}
