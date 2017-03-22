package edu.jalc.automobile.onlinebuilder.components.body;

public class Suv extends Body{

  public Suv(Quarterpanels quarterpanels, EngineCompartment engineCompartment,
                                Cabin cabin, StandardTrunk standardTrunk){
    super(quarterpanels, engineCompartment, cabin, standardTrunk);
  }

  public StandardTrunk getStandardTrunk(){
    return (StandardTrunk) this.getTrunk();
  }

  abstract Cabin getCabin(){}

  public String toString(){
    return "Adding StandardTrunk to Suv";
  }
}
