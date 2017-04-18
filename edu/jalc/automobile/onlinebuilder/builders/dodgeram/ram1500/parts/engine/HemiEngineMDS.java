package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.enigne;

public class HemiEngineMDS extends HemiEngine{

  public HemiEngineMDS(double displacement, HorsePower horsePower, Torque torque, int cylinders){
    super(displacement, horsePower, torque, cylinders);
  }

  public String toString(){
    return "5.7-Liter V8 HEMI VVT" + super.toString();
  }
}
