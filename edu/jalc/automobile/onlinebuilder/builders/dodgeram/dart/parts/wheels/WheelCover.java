package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.wheels;

import edu.jalc.automobile.parts.suspension.AlloyWheel;
import edu.jalc.automobile.parts.suspension.EconomyTire;

public class WheelCover extends AlloyWheel{
    public WheelCover(double size, EconomyTire tires) {
        super(size, tires);
    }

    @Override
    public String toString() {
        return this.getSize() + " inch Wheel Cover";
    }

}
