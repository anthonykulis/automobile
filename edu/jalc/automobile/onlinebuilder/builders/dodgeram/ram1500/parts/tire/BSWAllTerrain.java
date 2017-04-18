package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire;
import edu.jalc.automobile.parts.suspension.AllTerrainTire;

public class BSWAllTerrain  extends AllTerrainTire  {
   private String tireDetails;
    
   private BSWAllTerrain(){
      super(0,0);
   }
   
   public BSWAllTerrain(double height, double width){
      super(height, width);
   }

   
   public String toString(){
      return tireDetails+ " BSW All Terrain Tire";
   }
}