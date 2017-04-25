package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.wheels;

import edu.jalc.automobile.parts.suspension.AlloyWheel;
import edu.jalc.automobile.parts.suspension.EconomyTire;

/**
 * Created by Nick on 4/19/2017.
 */
public class PolishedAlumWheels extends AlloyWheel {
    public PolishedAlumWheels(double size, EconomyTire tires) {
        super(size, tires);
    }

    @Override
    public String toString() {
        return this.getSize() + " inch Polished Aluminum Wheels";
    }
}
