package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart;

import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;

public interface DartBuilderInterface extends DodgeRamBuilderInterface{

   DartBuilderInterface askForPowerTrain();

   DartBuilderInterface askForColorAndInterior();

   DartBuilderInterface askForOptions();

   DartBuilderInterface askForPackages();

   Automobile build();
}
