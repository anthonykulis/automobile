package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.tire;

import edu.jalc.automobile.parts.suspension.SportTire;

public class ThreeSeasonPerformanceTire extends SportTire{

  private String description;

  public ThreeSeasonPerformanceTire(double height, double width, String description){
    super(height, width);
    this.description = description;
  }

  public String toString(){
      return this.description + " Three Season Performance Tires";
  }

}
