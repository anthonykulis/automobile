package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.builders.gtsportblacktop;


import java.util.*;
import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.common.utils.prompter.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.DartBuilderInterface;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.engine.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.paint.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.seatingandtrim.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.graphic.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.tires.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.wheels.*;
import edu.jalc.automobile.onlinebuilder.components.body.car.SedanBody;
import edu.jalc.automobile.onlinebuilder.components.driveline.DriveLine;
import edu.jalc.automobile.onlinebuilder.components.driveline.economic.EconomicFWD;
import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.economy.EcoEngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.economy.standard.StandardEcoEngine;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;
import edu.jalc.automobile.onlinebuilder.components.suspension.Suspension;
import edu.jalc.automobile.onlinebuilder.components.suspension.economy.EconomySuspension;
import edu.jalc.automobile.onlinebuilder.components.engine.economy.boosted.turbocharged.TurbochargedEcoEngine;
import edu.jalc.automobile.parts.engine.EcoEngine;
import edu.jalc.automobile.parts.exhaust.*;
import edu.jalc.automobile.parts.induction.NaturallyAspiratedInduction;
import edu.jalc.automobile.parts.suspension.Tire;
import edu.jalc.automobile.parts.suspension.Wheel;
import edu.jalc.automobile.parts.body.*;
import edu.jalc.automobile.parts.suspension.*;
import edu.jalc.automobile.parts.driveline.*;
import edu.jalc.automobile.parts.body.seat.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.exhaust.*;
import edu.jalc.automobile.parts.induction.TurbochargedInduction;



public class GtSportBlackTopBuilder implements DartBuilderInterface {
    private Paint carPaint;
    private Seat seat;
    private AlloyWheel wheel;
    private EconomyTire tire;
    private EcoEngine engine;
    private Cabin cabin;
    private Graphic carGraphic;

    @Override
    public GtSportBlackTopBuilder askForPowerTrain() {
        TerminalPrompterBuilder promptBuilder = new TerminalPrompterBuilder();

        promptBuilder.addType("Car Engine");

        promptBuilder.addOption(
                new TwoLiterI4DOHCEngine(
                        2.0,
                        new HorsePower(160,2000),
                        new Torque(184,2000),
                        4
                )
        );

        promptBuilder.addOption(
                new TwoPointFourLiterI4MultiAirEngine(
                        2.4,
                        new HorsePower(160,2000),
                        new Torque(184,2000),
                        4
                )
        );


        promptBuilder.sort();
        ArrayList<Object> engineList = promptBuilder.getOptions();

        try {
            TerminalPrompter terminalPrompter = promptBuilder.build();

            int result = terminalPrompter.ask();

            engine = (EcoEngine)engineList.get(result - 1);

            return this;

        } catch (Exception e) {
            e.printStackTrace();

        }
        return this;
    }



    @Override
    public GtSportBlackTopBuilder askForColorAndInterior( ) {
        TerminalPrompterBuilder promptBuilder = new TerminalPrompterBuilder();

        promptBuilder.addType("Color");

        promptBuilder.addOption(new BilletSilverMetallicClearCoat());

        promptBuilder.addOption(new BrightWhiteClearCoat());

        promptBuilder.addOption(new GoMango());

        promptBuilder.addOption(new GraniteCrystalMetallicClearCoat());

        promptBuilder.addOption(new PitchBlackClearCoat());

        promptBuilder.addOption(new B5BluePearlCoat());


        ArrayList<Object> colors = promptBuilder.getOptions();
        promptBuilder.sort();
        

        try{
            TerminalPrompter prompter = promptBuilder.build();

            int result = prompter.ask();

            carPaint = (Paint)colors.get(result - 1);
        }
        catch(Exception e){}

        promptBuilder = new TerminalPrompterBuilder();
        promptBuilder.addType("Seating & Trim");


        promptBuilder.addOption(new GTNappaLeatherSeatWithPerforatedSeatInserts());
        promptBuilder.addOption(new SportClothSeatBlackInteriorColor());

        ArrayList<Object> interior = promptBuilder.getOptions();


        try{
            TerminalPrompter prompter = promptBuilder.build();
            int result = prompter.ask();
            
            if (result < 5){
               seat = (ClothSeat)interior.get(result - 1);
               cabin = new StandardCabin((ClothSeat)seat);
            } 
            else {
             seat = (LeatherSeat)interior.get(result - 1);
             cabin = new LuxuryCabin((LeatherSeat)seat);
            }
        }
        catch(Exception e){
        }

        promptBuilder = new TerminalPrompterBuilder();
        promptBuilder.addType("Graphic");

        promptBuilder.addOption(new BodySideRedRhombusStripe());
        promptBuilder.addOption(new BlackRedGrayGraphic());
        promptBuilder.addOption(new NoSelection());

        ArrayList<Object> stripes = promptBuilder.getOptions();
        promptBuilder.sort();

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
    public GtSportBlackTopBuilder askForOptions() {
        TerminalPrompterBuilder promptBuilder = new TerminalPrompterBuilder();



        AllSeasonTires allSeasonTires = new AllSeasonTires();
        allSeasonTires.setTireDetails("225/45R17");

        promptBuilder.addType("Tires");
        promptBuilder.addOption(allSeasonTires);
        promptBuilder.sort();

        try {
            int result = promptBuilder.build().ask();
            assert result == 1;
            tire = (EconomyTire)promptBuilder.getOptions().get(0);
        } catch (Exception e) {}

        promptBuilder = new TerminalPrompterBuilder();

        promptBuilder.addType("Wheels");

        Wheel glossBlack10SpokeAlumWheel = new GlossBlack10SpokeAlumWheel(18,tire);

        promptBuilder.addOption(glossBlack10SpokeAlumWheel);
        promptBuilder.sort();

        ArrayList<Object> wheelTypes = promptBuilder.getOptions();

        try {
            int result = promptBuilder.build().ask();

            wheel = (AlloyWheel)wheelTypes.get(result - 1);
        } catch (Exception e) {

        }

        return this;
    }

    @Override
    public GtSportBlackTopBuilder askForPackages() {
        //~~~~~~~~~~~~~~~~~~~~~~
        //No packages on this

        return this;
    }

    @Override
    public Automobile build() {
        SedanBody coupe = new SedanBody(
                new Quarterpanels(carPaint, carGraphic),
                new EngineCompartment(new Hood(carPaint, carGraphic)),
                cabin,
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
                "GtSportBlackTop",
                coupe,
                economicFWD,
                ecoEngineAssembly,
                economySuspension
        );
    }



    public static void main(String[] args) {
        GtSportBlackTopBuilder gtSportBlackTopBuilder = new GtSportBlackTopBuilder();

        gtSportBlackTopBuilder.askForPowerTrain();
        gtSportBlackTopBuilder.askForColorAndInterior();
        gtSportBlackTopBuilder.askForPackages();
        gtSportBlackTopBuilder.askForOptions();
        System.out.println(gtSportBlackTopBuilder.build());

    }
}
