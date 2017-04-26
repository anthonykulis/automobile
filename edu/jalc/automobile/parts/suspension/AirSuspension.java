package edu.jalc.automobile.parts.suspension;
import edu.jalc.automobile.onlinebuilder.components.suspension.Suspension;

public class AirSuspension extends Suspension{

  String suspension;
  public AirSuspension(){
    this.suspension = "Auto Level Rear Air Suspension";
  }

  public String toString(){
    return suspension;
  }
}
