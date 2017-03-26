package edu.jalc.automobile.onlinebuilder.components.body;

import edu.jalc.automobile.parts.body.EngineCompartment;
import edu.jalc.automobile.parts.body.Quarterpanels;
import edu.jalc.automobile.parts.body.StandardCabin;
import edu.jalc.automobile.parts.body.StandardTrunk;

public class EconomySuv extends Suv{
  public EconomySuv(Quarterpanels quarterpanels, EngineCompartment engineCompartment,
                        StandardCabin standardCabin, StandardTrunk standardTrunk){
    super(quarterpanels, engineCompartment, standardCabin, standardTrunk);
  }
  public StandardCabin getCabin(){
    return (StandardCabin) super.getCabin();
  }

  public String toString(){
    return "Adding StandardCabin to EconomySuv";
  }
}
