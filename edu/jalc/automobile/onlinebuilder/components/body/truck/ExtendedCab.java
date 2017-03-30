package edu.jalc.automobile.onlinebuilder.components.body.truck;

import edu.jalc.automobile.parts.body.*;

public class ExtendedCab extends Truck {

	public ExtendedCab(Quarterpanels quarterpanels, EngineCompartment engineCompartment,
	                   Cabin cabin, TruckBed truckBed) {
		super(quarterpanels, engineCompartment, cabin, truckBed);
	}

	public LuxuryCabin getCabin() {
		return (LuxuryCabin) super.getCabin();
	}

	public String toString(){
      return "ExtendedCab has :\n" +
                       "\t"+ getQuarterpanels() +"\n"+
                       "\t"+ getEngineCompartment()+"\n"+
                       "\t"+ getCabin()+"\n"+
                       "\t"+ getTruckBed();
   
   }}
