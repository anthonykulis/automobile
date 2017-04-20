package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.aero;

import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.common.utils.prompter.TerminalPrompter;
import edu.jalc.automobile.common.utils.prompter.TerminalPrompterBuilder;
import edu.jalc.automobile.common.utils.prompter.TerminalPrompterBuilderInterface;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.color.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.engine.Engine;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.engine.OnePointFourLiterI4SixteenValveMultiAirTurboEngine;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.seatingandtrim.SeatingAndTrim;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.seatingandtrim.SportClothSeatBlackInteriorColor;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.tires.AllSeasonTires;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.wheels.SilverAlumWheel;
import edu.jalc.automobile.onlinebuilder.components.body.car.SedanBody;
import edu.jalc.automobile.onlinebuilder.components.driveline.DriveLine;
import edu.jalc.automobile.onlinebuilder.components.driveline.economic.EconomicFWD;
import edu.jalc.automobile.onlinebuilder.components.engine.economy.EcoEngineAssembly;

import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;

import edu.jalc.automobile.onlinebuilder.components.engine.economy.standard.StandardEcoEngine;
import edu.jalc.automobile.onlinebuilder.components.suspension.Suspension;
import edu.jalc.automobile.onlinebuilder.components.suspension.economy.EconomySuspension;
import edu.jalc.automobile.parts.engine.EcoEngine;
import edu.jalc.automobile.parts.suspension.Tire;
import edu.jalc.automobile.parts.suspension.Wheel;

public class AeroBuilder implements DodgeRamBuilderInterface {
    Engine engine;
    Color color;
    SeatingAndTrim seatingAndTrim;
    Wheel wheel;
    Tire tire;

    @Override
    public Automobile build() {
        SedanBody coupe = new SedanBody(
                null,
                null,
                null,
                null
        );

        DriveLine economicFWD = new EconomicFWD(
                null,
                null,
                null,
                null

        );



        EngineAssembly ecoEngineAssembly = new StandardEcoEngine(
                null,
                null,
                null
        );


        Suspension economySuspension= new EconomySuspension(
                null,
                null,
                null,
                null
        );

        EngineAssembly engineAssembly = new EcoEngineAssembly(
                null,
                null
        );


        return new Automobile(
                "Dodge Dart",
                "Aero",
                null,
                coupe,
                economicFWD,
                engineAssembly,
                economySuspension
        );
    }

    @Override
    public DodgeRamBuilderInterface askForColorAndInterior(TerminalPrompterBuilderInterface promptBuilder) {

        promptBuilder.addType("Color");

        Color billetSilverMetallicClearCoat = new BilletSilverMetallicClearCoat();
        promptBuilder.addOption(billetSilverMetallicClearCoat);

        Color brightWhiteClearCoat = new BrightWhiteClearCoat();
        promptBuilder.addOption(brightWhiteClearCoat);

        Color pitchBlackClearCoat = new PitchBlackClearCoat();
        promptBuilder.addOption(pitchBlackClearCoat);

        Color graniteCrystalMetallicClearCoat = new GraniteCrystalMetallicClearCoat();
        promptBuilder.addOption(graniteCrystalMetallicClearCoat);

        try {

            int result = promptBuilder.build().ask();

            assert (result > 0 && result < 5);

            switch (result) {
                case 1:
                    color = billetSilverMetallicClearCoat;
                    break;

                case 2:
                    color = brightWhiteClearCoat;
                    break;

                case 3:
                    color = pitchBlackClearCoat;
                    break;

                case 4:
                    color = graniteCrystalMetallicClearCoat;
                    break;
            }
        } catch (Exception e) {

        }

        promptBuilder = new TerminalPrompterBuilder();
        promptBuilder.addType("Seating & Trim");

        SeatingAndTrim sportClothSeatBlackInteriorColor= new SportClothSeatBlackInteriorColor();

        promptBuilder.addOption(sportClothSeatBlackInteriorColor);

        try {
            int result = promptBuilder.build().ask();
            assert result == 0;
            seatingAndTrim = sportClothSeatBlackInteriorColor;
        } catch (Exception e) {
            e.printStackTrace();
        }


        return this;
    }

    @Override
    public DodgeRamBuilderInterface askForOptions(TerminalPrompterBuilderInterface promptBuilder) {

        Wheel silverAlumWheel= new SilverAlumWheel(16);

        promptBuilder.addType("Wheels");
        promptBuilder.addOption(silverAlumWheel);
        promptBuilder.sort();

        try {
            int result = promptBuilder.build().ask();
            assert result == 1;
            wheel = silverAlumWheel;
        } catch (Exception e) {

        }
        promptBuilder = new TerminalPrompterBuilder();

        AllSeasonTires allSeasonTires = new AllSeasonTires();
        allSeasonTires.setTireDetails("205/55R16");

        promptBuilder.addType("Tires");
        promptBuilder.addOption(allSeasonTires);
        promptBuilder.sort();

        try {
            int result = promptBuilder.build().ask();
            assert result == 1;
            tire = allSeasonTires;
        } catch (Exception e) {

        }

        return this;
    }

    @Override
    public DodgeRamBuilderInterface askForPackages(TerminalPrompterBuilderInterface promptBuilder) {
        //~~~~~~~~~~~~~~~~~~~~~~
        //We Need to make packages still

        return this;
    }

    @Override
    public DodgeRamBuilderInterface askForPowerTrain(TerminalPrompterBuilderInterface promptBuilder) {

        Engine onePointFourLiterI4SixteenValveMultiAirTurboEngine = new OnePointFourLiterI4SixteenValveMultiAirTurboEngine();


        promptBuilder.addType("Engine");
        promptBuilder.addOption(onePointFourLiterI4SixteenValveMultiAirTurboEngine);
        promptBuilder.sort();

        try {
            TerminalPrompter terminalPrompter = promptBuilder.build();

            int result = terminalPrompter.ask();

            assert (result == 1);

            engine = onePointFourLiterI4SixteenValveMultiAirTurboEngine;

            return this;

        } catch (Exception e) {

        }
        return this;
    }

    public static void main(String[] args) {
        AeroBuilder aeroBuilder = new AeroBuilder();

        aeroBuilder.askForPowerTrain(new TerminalPrompterBuilder());
        aeroBuilder.askForColorAndInterior(new TerminalPrompterBuilder());
        aeroBuilder.askForPackages(new TerminalPrompterBuilder());
        aeroBuilder.askForOptions(new TerminalPrompterBuilder());
        aeroBuilder.build();

    }
}
