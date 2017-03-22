package automobile.edu.jalc.automobile.onlinebuilder.components.body.truck;

public class Truck extends Body{

  public Truck(Quarterpanels quarterpanels, EngineCompartment engineCompartment,
                                 Cabin cabin, TruckBed truckBed){
     super(quarterpanels, engineCompartment, cabin, truckBed);
   }

   public TruckBed getTruckBed(){
     return (TruckBed) this.TruckBed();
   }

   abstract Cabin getCabin(){}
 
public String toString(){
  return "Truck body has: ";
    }
  }
}
