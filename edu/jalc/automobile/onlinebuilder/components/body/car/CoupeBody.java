package edu.jalc.automobile.onlinebuilder.components.body.car;

import edu.jalc.automobile.parts.body.Cabin;
import edu.jalc.automobile.parts.body.EngineCompartment;
import edu.jalc.automobile.parts.body.Quarterpanels;
import edu.jalc.automobile.parts.body.StandardTrunk;

class CoupeBody extends CarBody {

	public CoupeBody(Quarterpanels quarterpanels, EngineCompartment engineCompartment, Cabin cabin, StandardTrunk trunk){
		super(quarterpanels, engineCompartment, cabin, trunk);
	}
}