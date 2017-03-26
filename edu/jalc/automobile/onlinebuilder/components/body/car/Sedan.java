package edu.jalc.automobile.onlinebuilder.components.body;

import edu.jalc.automobile.parts.StandardTrunk;
import edu.jalc.automobile.parts.Cabin;

public class Sedan extends Car{

  private StandardTrunk trunk;
  private StandardCabin cabin;
public String toSting(){
return "Sedan has ::\n" +
                    "\t"+ trunk +"\n"+
                    "\t"+ cabin;
}
}
