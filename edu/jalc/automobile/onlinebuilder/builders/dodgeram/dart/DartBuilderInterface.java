package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart;

import edu.jalc.automobile.Automobile;

public interface DartBuilderInterface {

   DartBuilderInterface askForPowerTrain();

   DartBuilderInterface askForColorAndInterior();

   DartBuilderInterface askForOptions();

   DartBuilderInterface askForPackages();

   Automobile build();
}
