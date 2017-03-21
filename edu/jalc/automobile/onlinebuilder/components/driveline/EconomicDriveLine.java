package edu.jalc.automobile.onlinebuilder.components.driveline; 

import edu.jalc.automobile.parts.driveline.ElectricSteering;
import edu.jalc.automobile.parts.driveline.OpenDifferential;

abstract public  class EconomicDriveLine{

   private ElectricSteering electricSteering=new ElectricSteering();
   private OpenDifferential openDifferential=new OpenDifferential();

   public EconomicDriveLine(){
      this.electricSteering=null;
      this.openDifferential=null;
   }
   public ElectricSteering getElectricSteering(){
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



