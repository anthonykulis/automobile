package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.tires;

import edu.jalc.automobile.parts.suspension.Tire;

/**
 * Created by Nick on 4/19/2017.
 */
public class AllSeasonTires extends Tire {
    public AllSeasonTires() {
        super(Double.NaN,Double.NaN);
    }
    String tireDetails;

    public void setTireDetails(String tireDetails) {
        this.tireDetails = tireDetails;
    }


    @Override
    public String toString() {
        return "A " + this.tireDetails + " all season tire";
    }
}
