package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire;
import edu.jalc.automobile.parts.suspension.AllTerrainTire;

public class BSWAllTerrain  extends TruckTire  {
  String tireDetails;
   public BSWAllTerrain(String tireDetails){
      super(tireDetails);
   } 
   public String toString(){
      return this.tireDetails +" BSW All Terrain Tire";
   }
}