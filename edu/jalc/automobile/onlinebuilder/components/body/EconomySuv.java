package edu.jalc.automobile.onlinebuilder.components.body;

public class EconomySuv extends Suv implements StandardCabin{
  public EconomySuv(Quarterpanels quarterpanels, EngineCompartment engineCompartment,
                        StandardCabin standardCabin, StandardTrunk standardTrunk){
    super(quarterpanels, engineCompartment, standardCabin, standardTrunk);
  }
  public StandardCabin getStandardCabin(){
    return (StandardCabin) this.getCabin();
  }

  public String toString(){
    return "Adding StandardCabin to EconomySuv";
  }
}
