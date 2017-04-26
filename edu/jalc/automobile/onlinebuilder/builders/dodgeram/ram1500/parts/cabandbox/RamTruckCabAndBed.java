package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.cabandbox;
import  edu.jalc.automobile.parts.body.TruckBed;

public class RamTruckCabAndBed extends TruckBed{
private String cabName;
private double bedLength;

   private RamTruckCabAndBed(){
   this.bedLength=0.0;
   this.cabName=null;
   }
    public RamTruckCabAndBed(double bedLength,String cabName){
   this.bedLength=bedLength;
   this.cabName=cabName;
   }
//ignoring this useless method
   public double getCubicFt(){
      return 0.0;
      }
   public String toString(){
      return "Cab and Box:"+cabName+ " " +bedLength;
   
   }
}