package edu.jalc.automobile.onlinebuilder.components.body.car;

import edu.jalc.automobile.onlinebuilder.components.body.Body;
import edu.jalc.automobile.parts.body.*;


abstract public class CarBody extends Body {

  private Trunk trunk;

  public CarBody(Quarterpanels quarterpanels, EngineCompartment engineCompartment,
                 Cabin cabin, StandardTrunk standardTrunk){
      super(quarterpanels, engineCompartment, cabin);
      this.trunk = standardTrunk;
    }

	public Trunk getTrunk(){ return this.trunk; }

}
