public class SuperSportAWD extends SportDriveLine{

  private AllWheelDriveAxle allWheelDriveAxle;

  public SuperSportAWD(AllWheelDriveAxle allWheelDriveAxle,
                       DriveShaft driveShaft,
                       HydraulicSteering hydraulicSteering,
                       TorqueVectorDifferential torqueVectorDifferential){
    super(driveShaft, hydraulicSteering, torqueVectorDifferential);
    AllWheelDriveAxle = allWheelDriveAxle;
  }

  public getAllWheelDriveAxle(){
    return this.allWheelDriveAxle;
  }

  public String toString(){
    return "SuperSportAWD has :"\n"+
           "\t"+ AllWheelDriveAxle + "\n"+
           "\t"+ DriveShaft + "\n"+
           "\t"+ HydraulicSteering + "\n"+
           "\t"+ TorqueVectorDifferential";
  }
}
