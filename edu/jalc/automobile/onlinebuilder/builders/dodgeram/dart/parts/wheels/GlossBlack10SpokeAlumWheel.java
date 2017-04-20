package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.wheels;

import edu.jalc.automobile.parts.suspension.Wheel;

/**
 * Created by Nick on 4/19/2017.
 */
public class GlossBlack10SpokeAlumWheel extends Wheel{
    GlossBlack10SpokeAlumWheel(double size) {
        super(size);
    }

    @Override
    public String toString() {
        return this.getSize() + "inch Gloss Black 10 Spoke Aluminum Wheel";
    }
}
