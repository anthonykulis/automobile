package edu.jalc.automobile.onlinebuilder.components.body.truck;

import edu.jalc.automobile.onlinebuilder.components.body.Body;
import edu.jalc.automobile.parts.body.Cabin;
import edu.jalc.automobile.parts.body.EngineCompartment;
import edu.jalc.automobile.parts.body.Quarterpanels;
import edu.jalc.automobile.parts.body.TruckBed;

abstract public class Truck extends Body {

  public Truck(Quarterpanels quarterpanels, EngineCompartment engineCompartment,
                                 Cabin cabin, TruckBed truckBed){
     super(quarterpanels, engineCompartment, cabin, truckBed);
   }

   public TruckBed getTruckBed(){
     return (TruckBed) super.TruckBed();
   }

   abstract Cabin getCabin(){}

public String toString(){
  return "truck body has: ";
    }
  }
