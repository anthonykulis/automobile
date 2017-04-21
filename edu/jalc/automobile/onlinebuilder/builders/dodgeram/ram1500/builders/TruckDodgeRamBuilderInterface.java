package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.builders;

import  edu.jalc.automobile.onlinebuilder.builders.dodgeram. DodgeRamBuilderInterface;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.drive.TruckDrive;
 import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.cabandbox.RamTruckCabAndBed ;
import edu.jalc.automobile.Automobile;

public interface TruckDodgeRamBuilderInterface extends DodgeRamBuilderInterface {

   TruckDrive askForTruckDrive(); 
   
    RamTruckCabAndBed  askForTruckCabAndBed();

   DodgeRamBuilderInterface askForPowerTrain();

	/*
		Note. This introduces code debt. There is no way arouond it. Going off of the Dodge supplied processes, color and interior are in the same process. The process is named "Color". This means if we just ask for color, we suffer that knowdledge domain issue of having to put in interior anyways. If we ask for two separate items, color and then interior, we have to know to put that on one process. The class voted this is the way they wanted to handle this.
	 */
   DodgeRamBuilderInterface askForColorAndInterior();


   DodgeRamBuilderInterface askForOptions();

   DodgeRamBuilderInterface askForPackages();

   Automobile build();
}
