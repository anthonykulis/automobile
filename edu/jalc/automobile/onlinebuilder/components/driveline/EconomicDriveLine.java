package edu.jalc.automobile.onlinebuilder.components.driveline; 

import edu.jalc.automobile.parts.driveline.ElectricSteering;
import edu.jalc.automobile.parts.driveline.OpenDifferential;
import edu.jalc.automobile.onlinebuilder.components.driveline.DriveLine;

public  class EconomicDriveLine extends DriveLine{

   private final ElectricSteering electricSteering;
   private final OpenDifferential openDifferential;

   private EconomicDriveLine(){
      this.electricSteering=null;
      this.openDifferential=null;
   }
   
    public EconomicDriveLine(ElectricSteering electricSteering,OpenDifferential openDifferential){
      this.electricSteering=electricSteering;
      this.openDifferential=openDifferential;
   }

   public  ElectricSteering getElectricSteering(){
      return this.electricSteering;
   }
   public OpenDifferential getOpenDifferential(){
      return this.openDifferential;
   }
   public String toString(){
      return "EconomicDriveLine has:\n" +
                    "\t"+ electricSteering +"\n"+
                    "\t"+ openDifferential;
   }                   

}



