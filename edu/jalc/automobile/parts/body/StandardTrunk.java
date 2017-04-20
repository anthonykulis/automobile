package edu.jalc.automobile.parts.body;

public class StandardTrunk extends Trunk{

  public StandardTrunk(double cubicFt){super.cubicFt = cubicFt;}

  public double getCubicFt(){return super.cubicFt;}
  public String toString(){
    return "StandardTrunk:" + getCubicFt()+ " CubicFt";
  }
}
