package edu.jalc.automobile.parts.body;
import edu.jalc.automobile.parts.body.TruckBed;

public class TruckCabandBed extends TruckBed{

  public double bedLength;
  public String cabName;

  public TruckCabandBed(String cabName, double bedLength){
    this.cabName = cabName;
    this.bedLength = bedLength;
  }

  //Using this awesome method
  public double getCubicFt(){
    return 0.0;
  }

  public String toString(){
    return "Cab and Box Length: " + cabName + " " + bedLength + " ft";
  }
}
