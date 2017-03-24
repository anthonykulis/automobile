package automobile.edu.jalc.automobile.onlinebuilder.components.body.truck;

import edu.jalc.automobile.parts.Cabin;
import edu.jalc.automobile.parts.TruckBed;
import edu.jalc.automobile.parts.Quarterpanels;
import edu.jalc.automobile.parts.EngineCompartment;

abstract public class Truck extends Body{

  public Truck(Quarterpanels quarterpanels, EngineCompartment engineCompartment,
                                 Cabin cabin, TruckBed truckBed){
     super(quarterpanels, engineCompartment, cabin, truckBed);
   }

   public TruckBed getTruckBed(){
     return (TruckBed) super.TruckBed();
   }

   abstract Cabin getCabin(){}

public String toString(){
  return "Truck body has: ";
    }
  }
