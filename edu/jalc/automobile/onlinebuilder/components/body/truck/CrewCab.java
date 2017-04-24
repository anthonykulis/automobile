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
<<<<<<< HEAD
      return "Crew Cab has :\n" +
=======
      return "CrewCab has :\n" +
>>>>>>> b9377132d8da211ccc8871f3dc51556e05df5a4a
                       "\t"+ getQuarterpanels() +"\n"+
                       "\t"+ getEngineCompartment()+"\n"+
                       "\t"+ getCabin()+"\n"+
                       "\t"+ getTruckBed();

   }}
