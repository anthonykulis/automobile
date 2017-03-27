package edu.jalc.automobile.onlinebuilder.components.driveline;

import edu.jalc.automobile.parts.driveline.DriveShaft;
import edu.jalc.automobile.parts.driveline.HydraulicSteering;
import edu.jalc.automobile.parts.driveline.TorqueVectorDifferential;

public class SportDriveLine extends DriveLine{

  private DriveShaft driveShaft;
  private HydraulicSteering hydraulicSteering;
  private TorqueVectorDifferential torqueVectorDifferential;

  private SportDriveLine(){
    this.driveShaft = null;
    this.hydraulicSteering = null;
    this.torqueVectorDifferential = null;
  }

  public SportDriveLine(DriveShaft driveShaft,
                        HydraulicSteering hydraulicSteering,
                        TorqueVectorDifferential torqueVectorDifferential){
    this.driveShaft = driveShaft;
    this.hydraulicSteering = hydraulicSteering;
    this.torqueVectorDifferential = torqueVectorDifferential;
  }

  public DriveShaft getDriveShaft(){
    return this.driveShaft;
  }

  public HydraulicSteering getHydraulicSteering(){
    return this.hydraulicSteering;
  }

  public TorqueVectorDifferential getTorqueVectorDifferential(){
    return this.torqueVectorDifferential;
  }

  public String toString(){
    return "SportDriveLine has :\n"+
           "\t"+ driveShaft + "\n"+
           "\t"+ hydraulicSteering + "\n"+
           "\t"+ torqueVectorDifferential;
  }

}
