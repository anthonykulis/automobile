package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.wheels;

import edu.jalc.automobile.parts.suspension.AlloyWheel;
import edu.jalc.automobile.parts.suspension.EconomyTire;

/**
 * Created by Nick on 4/19/2017.
 */
public class GlossBlack10SpokeAlumWheel extends AlloyWheel{
    public GlossBlack10SpokeAlumWheel(double size, EconomyTire tires) {
        super(size, tires);
    }

    @Override
    public String toString() {
        return this.getSize() + " inch Gloss Black 10 Spoke Aluminum Wheel";
    }
}
