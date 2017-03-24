package automobile.edu.jalc.automobile.onlinebuilder.components.body.truck;

import edu.jalc.automobile.parts.Cabin;
import edu.jalc.automobile.parts.TruckBed;
import edu.jalc.automobile.parts.Quarterpanels;
import edu.jalc.automobile.parts.EngineCompartment;

public class StandardCab extends Truck{

  public StandardCab(Quarterpanels quarterpanels, EngineCompartment engineCompartment,
                                 Cabin cabin, TruckBed truckBed){
     super(quarterpanels, engineCompartment, cabin, truckBed);
   }

   public StandardCabin getCabin(){
     return (StandardCabin) super.getCabin();
   }
   public ShortBed getTruckBed(){
     return (ShortBed) super.TruckBed();
   }


public String toString(){
  return "StardardCabin and a ShortBed";
    }
  }
