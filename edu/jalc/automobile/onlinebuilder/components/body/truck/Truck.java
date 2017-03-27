package edu.jalc.automobile.onlinebuilder.components.body.truck;

import edu.jalc.automobile.onlinebuilder.components.body.Body;
import edu.jalc.automobile.parts.body.Cabin;
import edu.jalc.automobile.parts.body.EngineCompartment;
import edu.jalc.automobile.parts.body.Quarterpanels;
import edu.jalc.automobile.parts.body.TruckBed;

abstract public class Truck extends Body {

	private TruckBed truckBed;

	public Truck(Quarterpanels quarterpanels, EngineCompartment engineCompartment,
	             Cabin cabin, TruckBed truckBed) {
		super(quarterpanels, engineCompartment, cabin);
		this.truckBed = truckBed;
	}

	public TruckBed getTruckBed() {
		return this.truckBed;
	}


	public String toString() {
		return "truck body has :\n" +
                        "\t"+getQuarterpanels().toString()+"\n"+ 
                        "\t" + getEngineCompartment().toString()+"\n"+
                 	      "\t" +getCabin().toString()+"\n"+
                        "\t" + getTruckBed().toString();                    
	}
}
