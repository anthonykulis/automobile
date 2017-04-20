package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.tires;

import edu.jalc.automobile.parts.suspension.Tire;

/**
 * Created by Nick on 4/19/2017.
 */
public class AllSeasonTires extends Tire {
    String tireDetails;

    AllSeasonTires(double height,double width) {
        super(height,width);
    }

    public void setTireDetails(String tireDetails) {
        this.tireDetails = tireDetails;
    }

    @Override
    public String toString() {
        return "A " + this.tireDetails + " all season tire";
    }
}
