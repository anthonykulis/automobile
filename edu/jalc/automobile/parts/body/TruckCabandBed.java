package edu.jalc.automobile.parts.body;
import edu.jalc.automobile.parts.body.TruckBed;

public class TruckCabandBed extends TruckBed{

  public int bedLengthFt;
  public int bedLengthIn;
  public String cabName;

  public TruckCabandBed(String cabName, int bedLengthFt, int bedLengthIn){
    this.cabName = cabName;
    this.bedLengthFt = bedLengthFt;
    this.bedLengthIn = bedLengthIn;
  }

  //Using this awesome method
  public double getCubicFt(){
    return 0.0;
  }

  public String toString(){
    return "Cab and Box Length: " + cabName + " " + bedLengthFt + "\'" + bedLengthIn + "\"";
  }
}
