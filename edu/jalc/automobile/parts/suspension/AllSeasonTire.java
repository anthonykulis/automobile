package edu.jalc.automobile.parts.suspension;

public class AllSeasonTire extends Tire {


   public AllSeasonTire(){
      super(0,0);
   }

   private AllSeasonTire(double height, double width){
      super(height, width);
   }


   public String toString(){
      return "All Season Tire";
   }
}
