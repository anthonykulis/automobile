package edu.jalc.automobile.parts.driveline;

public class RearAxleRatio extends RearDriveAxle{

  private double ratio;

  public RearAxleRatio(double ratio){
    this.ratio = ratio;
  }

  public double getRatio(){
    return this.ratio;
  }

  public String toString(){
    return " Axle Ratio" + getRatio();
  }
}
