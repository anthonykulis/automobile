package edu.jalc.automobile.onlinebuilder.components.suspension;

import edu.jalc.automobile.onlinebuilder.components.suspension.sport.SportAdjustable;
import edu.jalc.automobile.onlinebuilder.components.suspension.sport.SportLowered;
import edu.jalc.automobile.onlinebuilder.components.suspension.sport.SportRaised;
import edu.jalc.automobile.onlinebuilder.components.suspension.towing.TowingHeavyDuty;
import edu.jalc.automobile.onlinebuilder.components.suspension.towing.TowingLightDuty;
import edu.jalc.automobile.onlinebuilder.components.suspension.towing.TowingSuperDuty;
import edu.jalc.automobile.parts.suspension.*;

import javax.swing.plaf.synth.SynthTextAreaUI;

/**
 * Created by Nick on 3/27/2017.
 */
public class Driver {
    public static void main(String[] args) {


        ExtendedShocks shocks = new ExtendedShocks(99);
        ExtendedSpring spring = new ExtendedSpring(4);
        SportTire sportTire= new SportTire(5,4);
        ForgedWheel forgedWheel = new ForgedWheel(5);

        SportRaised sportRaised = new SportRaised(shocks,spring,sportTire,forgedWheel);

        System.out.println(sportRaised.toString());


        ShortShocks shortShocks = new ShortShocks(5);
        ShortSpring shortSpring = new ShortSpring(5);
        SportLowered sportLowered = new SportLowered(shortShocks,shortSpring,sportTire,forgedWheel);
        System.out.println(sportLowered.toString());

        SportAdjustable sportAdjustable = new SportAdjustable(new AdjustableShocks(4),new MediumSpring(4),sportTire,forgedWheel);
        System.out.println(sportAdjustable.toString());

        AllTerrainTire allTerrainTire = new AllTerrainTire(5,5);
        SteelWheel steelWheel = new SteelWheel(4);

        TowingHeavyDuty towingHeavyDuty = new TowingHeavyDuty(new HeavyShock(4),new HeavySpring(5),allTerrainTire,steelWheel);
        System.out.println(towingHeavyDuty.toString());

        TowingLightDuty towingLightDuty = new TowingLightDuty(new LightShock(5),new LightSpring(5),allTerrainTire,steelWheel);
        System.out.println(towingLightDuty.toString());

        TowingSuperDuty towingSuperDuty = new TowingSuperDuty(new SuperShock(5),new SuperSpring(5),allTerrainTire,steelWheel);
        System.out.println(towingSuperDuty.toString());


    }

}
