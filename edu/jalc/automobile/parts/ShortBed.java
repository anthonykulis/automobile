package edu.jalc.automobile.parts;

public class ShortBed extends TruckBed{

public ShortBed(double cubicFt){super.cubicFt = cubicFt;}

public double getCubicFt()
  {return super.cubicFt;}
public String toString(){
    return "ShortBed";
  }
}
