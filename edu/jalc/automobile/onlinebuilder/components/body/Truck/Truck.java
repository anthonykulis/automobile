package automobile.edu.jalc.automobile.onlinebuilder.components.body.truck;

public class Truck{
  private TruckBed truckBed;
  abstract public TruckBed getTruckBed(){};
  abstract public Cabin getCabin(){};


public String toString(){
  return "Truck body has: ";
    }

}
