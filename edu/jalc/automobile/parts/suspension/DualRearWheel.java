package edu.jalc.automobile.parts.suspension;

public class DualRearWheel extends Wheel{

  private DualRearWheel(double size){
    super(0);
  }

  public DualRearWheel(){
    super(17);
  }

  public String toString(){
    return "Dual Rear Wheel " + getSize() + " inch";
  }
}
