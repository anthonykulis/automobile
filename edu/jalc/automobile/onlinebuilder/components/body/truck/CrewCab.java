package edu.jalc.automobile.onlinebuilder.components.body.truck;

import edu.jalc.automobile.parts.body.*;

public class CrewCab extends Truck {

	public CrewCab(Quarterpanels quarterpanels, EngineCompartment engineCompartment,
	               Cabin cabin, TruckBed truckBed) {
		super(quarterpanels, engineCompartment, cabin, truckBed);
	}

	public Cabin getCabin() {
		return super.getCabin();
	}
	public String toString(){
      return "Crew Cab has :\n" +
                       "\t"+ getQuarterpanels() +"\n"+
                       "\t"+ getEngineCompartment()+"\n"+
                       "\t"+ getCabin()+"\n"+
                       "\t"+ getTruckBed();

   }
}
