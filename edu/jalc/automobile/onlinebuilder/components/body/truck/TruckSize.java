package edu.jalc.automobile.onlinebuilder.components.body.truck;

import edu.jalc.automobile.parts.body.Bed4x4;
import edu.jalc.automobile.parts.body.RegularCabin;
import edu.jalc.automobile.parts.body.*;

public class TruckSize{

  private CabSize cabin;
  private BedSize bed;

  public TruckSize(CabSize cabin, BedSize bed){
    this.cabin = cabin;
    this.bed = bed;
  }

  public String toString(){
    return "Truck Size:\n\t" + cabin + "\n\t" + bed;
  }
}
