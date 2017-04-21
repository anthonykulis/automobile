package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.wheels;

import edu.jalc.automobile.parts.suspension.Wheel;

/**
 * Created by Nick on 4/19/2017.
 */
public class HyperBlackAlumWheels extends Wheel {
    public HyperBlackAlumWheels(double size) {
        super(size);
    }

    @Override
    public String toString() {
        return this.getSize() + "inch Hyper Black Aluminum Wheels";
    }

}
