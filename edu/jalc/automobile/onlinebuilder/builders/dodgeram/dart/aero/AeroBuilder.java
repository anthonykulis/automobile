package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.aero;

import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.common.utils.prompter.TerminalPrompter;
import edu.jalc.automobile.common.utils.prompter.TerminalPrompterBuilder;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.engine.Engine;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.engine.OnePointFourLiterI4SixteenValveMultiAirTurboEngine;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.exhaust.SingleExhaust;
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
import edu.jalc.automobile.onlinebuilder.components.engine.economy.EcoEngineAssembly;
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
    private Paint carPaint;
    private ClothSeat clothSeat;
    private AlloyWheel wheel;
    private EconomyTire tire;
    private EcoEngine engine;
    private Graphic carGraphic;

    @Override
    public AeroBuilder askForPowerTrain() {
        TerminalPrompterBuilder promptBuilder = new TerminalPrompterBuilder();

        promptBuilder.addType("Engine");
        promptBuilder.addOption(
                new OnePointFourLiterI4SixteenValveMultiAirTurboEngine(
                        2.0,
                        new HorsePower(160,2000),
                        new Torque(184,2000),
                        4
                )
        );
        promptBuilder.sort();

        try {
            TerminalPrompter terminalPrompter = promptBuilder.build();

            int result = terminalPrompter.ask();

            assert(result == 1);


            engine = (EcoEngine)promptBuilder.getOptions().get(0);

            return this;

        } catch (Exception e) {
            System.out.println(e);

        }
        return this;
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



        AllSeasonTires allSeasonTires = new AllSeasonTires();
        allSeasonTires.setTireDetails("205/55R16");

        promptBuilder.addType("Tires");
        promptBuilder.addOption(allSeasonTires);
        promptBuilder.sort();

        try {
            int result = promptBuilder.build().ask();
            assert result == 1;
            tire = (EconomyTire)promptBuilder.getOptions().get(0);
        } catch (Exception e) {

        }
        promptBuilder = new TerminalPrompterBuilder();

        Wheel silverAlumWheel= new SilverAlumWheel(16,tire);

        promptBuilder.addType("Wheels");
        promptBuilder.addOption(silverAlumWheel);
        promptBuilder.sort();

        try {
            int result = promptBuilder.build().ask();
            assert result == 1;
            wheel = (AlloyWheel)promptBuilder.getOptions().get(0);
        } catch (Exception e) {

        }

        return this;
    }


    @Override
    public AeroBuilder askForPackages() {
        //~~~~~~~~~~~~~~~~~~~~~~
        //No packages on this

        return this;
    }

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

        EcoEngineAssembly ecoEngineAssembly = new TurbochargedEcoEngine(
                engine,
                new SingleExhaust(),
                new TurbochargedInduction()
        );

        Suspension economySuspension= new EconomySuspension(
                new StockShock(0),
                new StockSpring(0),
                tire,
                wheel
        );

        return new Automobile(
                "Dodge",
                "Dart",
                "Aero",
                coupe,
                economicFWD,
                ecoEngineAssembly,
                economySuspension
        );
    }






    public static void main(String[] args) {
        AeroBuilder aeroBuilder = new AeroBuilder();

        aeroBuilder.askForPowerTrain();
        aeroBuilder.askForColorAndInterior();
        aeroBuilder.askForPackages();
        aeroBuilder.askForOptions();
        System.out.println(aeroBuilder.build());


    }
}
