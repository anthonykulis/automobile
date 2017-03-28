package edu.jalc.automobile.onlinebuilder.components.body.suv;

import edu.jalc.automobile.onlinebuilder.components.body.Body;
import edu.jalc.automobile.parts.body.*;

abstract public class SuvBody extends Body {

  private Hatchback hatchback;

  public SuvBody(Quarterpanels quarterpanels, EngineCompartment engineCompartment,
                 Cabin cabin, Hatchback hatchback){
    super(quarterpanels, engineCompartment, cabin);
    this.hatchback = hatchback;
  }

  public Hatchback getHatchback(){ return this.hatchback; }
}
