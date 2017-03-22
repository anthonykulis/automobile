package edu.jalc.automobile.onlinebuilder.components.driveline;

import edu.jalc.automobile.parts.driveline.DriveShaft;
import edu.jalc.automobile.parts.driveline.ElectricSteering;
import edu.jalc.automobile.parts.driveline.LockingDifferential;

public class TruckDriveLineTest{

   protected void testGetDriveShaft(){
      System.out.println("Testing TruckDriveLine::getDriveShaft");
      DriveShaft driveShaft = new DriveShaft();
      TruckDriveLine truckDriveLine = new TruckDriveLine(driveShaft, null, null);
      assert(truckDriveLine.getDriveShaft() == driveShaft);
   }
   
   protected void testGetElectricSteering(){
      System.out.println("Testing TruckDriveLine::getElectricSteering");
      ElectricSteering electricSteering = new ElectricSteering();
      TruckDriveLine truckDriveLine = new TruckDriveLine(null, electricSteering, null);
      assert(truckDriveLine.getElectricSteering() == electricSteering);
   }
   
   protected void testGetLockingDifferential(){
      System.out.println("Testing TruckDriveLine::getLockingDrfferential");
      LockingDifferential lockingDifferential = new LockingDifferential();
      TruckDriveLine truckDriveLine = new TruckDriveLine(null, null, lockingDifferential);
      assert(truckDriveLine.getLockingDifferential() == lockingDifferential);
   }

   protected void testToString(){
      System.out.println("Testing TruckDriveLine::toString");
      TruckDriveLine truckDriveLine = new TruckDriveLine(null, null, null);
      assert(truckDriveLine.toString().equals("TruckDriveLine"));
   }
   
   public static void main(String[] args){
      TruckDriveLineTest test = new TruckDriveLineTest();
      test.testGetDriveShaft();
      test.testGetElectricSteering();
      test.testGetLockingDifferential();
      test.testToString();
      System.out.println("TruckDriveLineTest compleat");
   } 
}