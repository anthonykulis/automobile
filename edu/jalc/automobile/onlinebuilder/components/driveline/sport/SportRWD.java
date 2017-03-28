package edu.jalc.automobile.onlinebuilder.components.driveline.sport;

import edu.jalc.automobile.onlinebuilder.components.driveline.SportDriveLine;
import edu.jalc.automobile.parts.driveline.FrontDeadAxle;
import edu.jalc.automobile.parts.driveline.RearDriveAxle;
import edu.jalc.automobile.parts.driveline.DriveShaft;
import edu.jalc.automobile.parts.driveline.HydraulicSteering;
import edu.jalc.automobile.parts.driveline.TorqueVectorDifferential;

public class SportRWD extends SportDriveLine{

  private FrontDeadAxle frontDeadAxle;
  private RearDriveAxle rearDriveAxle;

  private SportRWD(){
    super(null, null, null);
    this.frontDeadAxle = null;
    this.rearDriveAxle = null;
  }

  public SportRWD(FrontDeadAxle frontDeadAxle,
                  RearDriveAxle rearDriveAxle,
                  DriveShaft driveShaft,
                  HydraulicSteering hydraulicSteering,
                  TorqueVectorDifferential torqueVectorDifferential){
    super(driveShaft, hydraulicSteering, torqueVectorDifferential);
    this.frontDeadAxle = frontDeadAxle;
    this.rearDriveAxle = rearDriveAxle;
  }

  public FrontDeadAxle getFrontDeadAxle(){
    return this.frontDeadAxle;
  }

  public RearDriveAxle getRearDriveAxle(){
    return this.rearDriveAxle;
  }

  public String toString(){
    return "SportRWD has :\n"+
           "\t"+ frontDeadAxle + "\n"+
           "\t"+ rearDriveAxle + "\n"+
           "\t"+ getDriveShaft() + "\n"+
           "\t"+ getHydraulicSteering() + "\n"+
           "\t"+ getTorqueVectorDifferential();
  }
}
