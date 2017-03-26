package edu.jalc.automobile.onlinebuilder.components.body.truck;

import edu.jalc.automobile.parts.body.*;

public class StandardCab extends Truck {


	public StandardCab(Quarterpanels quarterpanels, EngineCompartment engineCompartment,
	                   Cabin cabin, TruckBed truckBed) {
		super(quarterpanels, engineCompartment, cabin, truckBed);
	}

	public StandardCabin getCabin() {
		return (StandardCabin) super.getCabin();
	}


	public String toString() {
		return "StardardCabin and a ShortBed";
	}
}
