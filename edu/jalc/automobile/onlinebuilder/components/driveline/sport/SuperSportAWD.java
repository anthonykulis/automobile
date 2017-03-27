package edu.jalc.automobile.onlinebuilder.components.driveline.sport;

import edu.jalc.automobile.onlinebuilder.components.driveline.SportDriveLine;
import edu.jalc.automobile.parts.driveline.AllWheelDriveAxle;
import edu.jalc.automobile.parts.driveline.DriveShaft;
import edu.jalc.automobile.parts.driveline.HydraulicSteering;
import edu.jalc.automobile.parts.driveline.TorqueVectorDifferential;

public class SuperSportAWD extends SportDriveLine{

  private AllWheelDriveAxle allWheelDriveAxle;

  private SuperSportAWD(){
    super(null, null, null);
    this.allWheelDriveAxle = null;
  }

  public SuperSportAWD(AllWheelDriveAxle allWheelDriveAxle,
                       DriveShaft driveShaft,
                       HydraulicSteering hydraulicSteering,
                       TorqueVectorDifferential torqueVectorDifferential){
    super(driveShaft, hydraulicSteering, torqueVectorDifferential);
    this.allWheelDriveAxle = allWheelDriveAxle;
  }

  public AllWheelDriveAxle getAllWheelDriveAxle(){
    return this.allWheelDriveAxle;
  }

  public String toString(){
    return "SuperSportAWD has :\n"+
           "\t"+ allWheelDriveAxle + "\n"+
           "\t"+ getDriveShaft() + "\n"+
           "\t"+ getHydraulicSteering() + "\n"+
           "\t"+ getTorqueVectorDifferential();
  }
}
