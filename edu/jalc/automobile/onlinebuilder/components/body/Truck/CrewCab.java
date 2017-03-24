package automobile.edu.jalc.automobile.onlinebuilder.components.body.truck;

import edu.jalc.automobile.parts.Cabin;
import edu.jalc.automobile.parts.TruckBed;
import edu.jalc.automobile.parts.Quarterpanels;
import edu.jalc.automobile.parts.EngineCompartment;

public class CrewCab extends Truck{

  public CrewCab(Quarterpanels quarterpanels, EngineCompartment engineCompartment,
                                 Cabin cabin, TruckBed truckBed){
     super(quarterpanels, engineCompartment, cabin, truckBed);
   }

   public LuxuryCabin getCabin(){
     return (LuxuryCabin) super.getCabin();
   }
   public ShortBed getTruckBed(){
     return (ShortBed) super.TruckBed();
   }


public String toString(){
  return "LuxuryCabin and ShortBed";
    }
  }
