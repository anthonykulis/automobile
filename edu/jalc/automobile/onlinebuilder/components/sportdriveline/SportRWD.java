public class SportRWD extends SportDriveLine{
  private FrontDeadAxle frontDeadAxle;
  private RearDriveAxle rearDriveAxle;

  public SportRWD(FrontDeadAxle frontDeadAxle,
                  RearDriveAxle rearDriveAxle,
                  DriveShaft driveShaft,
                  HydraulicSteering hydraulicSteering,
                  TorqueVectorDifferential torqueVectorDifferential){
    super(driveShaft, hydraulicSteering, torqueVectorDifferential);
    FrontDeadAxle = frontDeadAxle;
    RearDriveAxle = rearDriveAxle;
  }

  public getFrontDeadAxle(){
    return this.frontDeadAxle;
  }

  public getRearDriveAxle(){
    return this.rearDriveAxle;
  }

  public String toString(){
    return "SportRWD";
  }
}
