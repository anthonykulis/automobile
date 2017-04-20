package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.enigne;

import edu.jalc.automobile.parts.engine.Engine;

public class HemiVVTEngine extends Engine{

  public HemiVVTEngine(){
    super(5.7,null,null,8);
  }

  public String toString(){
    return "HEMI VVT Engine"+ super.toString();
  }
}
