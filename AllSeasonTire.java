package edu.jalc.automobile.parts.suspension;

public class AllSeasonTire extends Tire {


   public AllSeasonTire(){
      super(0,0);
   }

   private AllSeason(double height, double width){
      super(height, width);
   }


   public String toString(){
      return "All Season Tire"";
   }
}
