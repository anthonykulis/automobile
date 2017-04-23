package edu.jalc.automobile.parts.body;
import edu.jalc.automobile.parts.body.TruckBed;

public class TruckCabandBed extends TruckBed{

  private double bedLength;
  private String cabName;

  public TruckCabandBed(bedLength, cabName){
    this.bedLength = bedLength;
    this.cabName = cabName;
  }

  //Using this awesome method
  public double getCublicFt(){
    return 0.0;
  }

  public String toString(){
    return "Cab and Box Length: " + cabName + bedLength;
  }
}
