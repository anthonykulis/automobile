package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire;
import edu.jalc.automobile.parts.suspension.AllTerrainTire;

public class BSWAllTerrain  extends TruckTire  {
   private String tireDetails;
       
   public BSWAllTerrain(double height, double width,String tireDetails){
      super(height, width,tireDetails);
   }

   
   public String toString(){
       return +getHeight()+ "x" +getWidth() +getTireDetails()+" BSW All Terrain Tire";
   }
}