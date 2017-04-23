package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.aero;

import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.common.utils.prompter.TerminalPrompter;
import edu.jalc.automobile.common.utils.prompter.TerminalPrompterBuilder;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.engine.Engine;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.engine.OnePointFourLiterI4SixteenValveMultiAirTurboEngine;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.graphic.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.paint.BilletSilverMetallicClearCoat;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.paint.BrightWhiteClearCoat;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.paint.GraniteCrystalMetallicClearCoat;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.paint.PitchBlackClearCoat;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.seatingandtrim.SportClothSeatBlackInteriorColor;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.tires.AllSeasonTires;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.wheels.SilverAlumWheel;
import edu.jalc.automobile.onlinebuilder.components.body.car.SedanBody;
import edu.jalc.automobile.onlinebuilder.components.driveline.DriveLine;
import edu.jalc.automobile.onlinebuilder.components.driveline.economic.EconomicFWD;
import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.economy.boosted.turbocharged.TurbochargedEcoEngine;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.HorsePower;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.Torque;
import edu.jalc.automobile.onlinebuilder.components.suspension.Suspension;
import edu.jalc.automobile.onlinebuilder.components.suspension.economy.EconomySuspension;
import edu.jalc.automobile.parts.body.*;
import edu.jalc.automobile.parts.body.seat.ClothSeat;
import edu.jalc.automobile.parts.driveline.ElectricSteering;
import edu.jalc.automobile.parts.driveline.FrontDriveAxle;
import edu.jalc.automobile.parts.driveline.OpenDifferential;
import edu.jalc.automobile.parts.driveline.RearDeadAxle;
import edu.jalc.automobile.parts.engine.EcoEngine;
import edu.jalc.automobile.parts.exhaust.EconomyExhaust;
import edu.jalc.automobile.parts.induction.TurbochargedInduction;
import edu.jalc.automobile.parts.suspension.*;

import java.util.ArrayList;

public class AeroBuilder implements DodgeRamBuilderInterface {
    Paint carPaint;
    ClothSeat clothSeat;
    Wheel wheel;
    Tire tire;
    Engine engine;
    Graphic carGraphic;

    @Override
    public Automobile build() {
        SedanBody coupe = new SedanBody(
                new Quarterpanels(carPaint, carGraphic),
                new EngineCompartment(new Hood(carPaint, carGraphic)),
                new StandardCabin(clothSeat),
                new StandardTrunk(13.0)
        );

        DriveLine economicFWD = new EconomicFWD(
                new FrontDriveAxle(),
                new RearDeadAxle(),
                new ElectricSteering(),
                new OpenDifferential()
        );

        EngineAssembly ecoEngineAssembly = new TurbochargedEcoEngine(
                new EcoEngine(1400,
                new HorsePower(160, 2),
                new Torque(184, 3), 4),
                new EconomyExhaust(),
                new TurbochargedInduction()
        );

        Suspension economySuspension= new EconomySuspension(
                new StockShock(0),
                new StockSpring(0),
                new EconomyTire(16, 16),
                new AlloyWheel(16, tire)
        );

        return new Automobile("Dodge", "Dart", "Aero", coupe, economicFWD, ecoEngineAssembly, economySuspension);
    }

    @Override
    public AeroBuilder askForColorAndInterior( ) {
        TerminalPrompterBuilder promptBuilder = new TerminalPrompterBuilder();

        promptBuilder.addType("Color");

        promptBuilder.addOption(new BilletSilverMetallicClearCoat());

        promptBuilder.addOption(new BrightWhiteClearCoat());

        promptBuilder.addOption(new PitchBlackClearCoat());

        promptBuilder.addOption(new GraniteCrystalMetallicClearCoat());

        ArrayList<Object> colors = promptBuilder.getOptions();

        try{
            TerminalPrompter prompter = promptBuilder.build();

            int result = prompter.ask();

            carPaint = (Paint)colors.get(result - 1);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        promptBuilder = new TerminalPrompterBuilder();
        promptBuilder.addType("Seating & Trim");


        promptBuilder.addOption(new SportClothSeatBlackInteriorColor());
        ArrayList<Object> interior = promptBuilder.getOptions();


        try{
            TerminalPrompter prompter = promptBuilder.build();

            int result = prompter.ask();

            clothSeat = (ClothSeat) interior.get(result - 1);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        promptBuilder = new TerminalPrompterBuilder();
        promptBuilder.addType("Graphic");
        promptBuilder.addOption(new RoofHoodGrayStripe());
        promptBuilder.addOption(new RoofHoodDualGrayStripes());
        promptBuilder.addOption(new RoofHoodDualBlackStripes());
        promptBuilder.addOption(new FullHoodBlackRedStripe());
        promptBuilder.addOption(new BodySideRedRhombusStripe());
        promptBuilder.addOption(new BlackRedGrayGraphic());

        ArrayList<Object> stripes = promptBuilder.getOptions();

        try{
            int result = promptBuilder.build().ask();

            carGraphic = (Graphic)stripes.get(result - 1);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        return this;

    }

    @Override
    public AeroBuilder askForOptions() {
        TerminalPrompterBuilder promptBuilder = new TerminalPrompterBuilder();

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
    public AeroBuilder askForPackages() {
        //~~~~~~~~~~~~~~~~~~~~~~
        //We Need to make packages still

        return this;
    }

    @Override
    public AeroBuilder askForPowerTrain() {
        TerminalPrompterBuilder promptBuilder = new TerminalPrompterBuilder();


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

        aeroBuilder.askForPowerTrain();
        aeroBuilder.askForColorAndInterior();
        aeroBuilder.askForPackages();
        aeroBuilder.askForOptions();
        aeroBuilder.build();


    }
}
