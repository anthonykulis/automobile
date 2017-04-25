package edu.jalc.automobile.onlinebuilder.components.body.truck;

import edu.jalc.automobile.parts.body.*;

public class ExtendedCab extends Truck {

	public ExtendedCab(Quarterpanels quarterpanels, EngineCompartment engineCompartment,
	                   Cabin cabin, TruckBed truckBed) {
		super(quarterpanels, engineCompartment, cabin, truckBed);
	}

	public Cabin getCabin() {
		return super.getCabin();
	}

	public String toString(){
      return "Extended Cab has :\n" +
                       "\t"+ getQuarterpanels() +"\n"+
                       "\t"+ getEngineCompartment()+"\n"+
                       "\t"+ getCabin()+"\n"+
                       "\t"+ getTruckBed();

   }}
