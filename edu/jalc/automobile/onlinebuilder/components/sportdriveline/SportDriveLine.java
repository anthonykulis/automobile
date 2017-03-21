public class SportDriveLine{

  private DriveShaft driveShaft;
  private HydraulicSteering hydraulicSteering;
  private TorqueVectorDifferential torqueVectorDifferential;

  public SportDriveLine(DriveShaft driveShaft,
                        HydraulicSteering hydraulicSteering,
                        TorqueVectorDifferential, torqueVectorDifferential){
    this.DriveShaft = driveShaft;
    this.HydraulicSteering = hydraulicSteering;
    this.TorqueVectorDifferential = torqueVectorDifferential;
  }

  public getDriveShaft(){
    return this.driveShaft;
  }

  public getHydraulicSteering(){
    return this.hydraulicSteering;
  }

  public getTorqueVectorDifferential(){
    return this.torqueVectorDifferential;
  }

  public String toString(){
    return "SportDriveLine";
  }

}
