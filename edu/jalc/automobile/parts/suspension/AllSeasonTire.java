package edu.jalc.automobile.parts.suspension;

public class AllSeasonTire extends Tire {


   private AllSeasonTire(){
      super(0,0);
   }

   public AllSeasonTire(double height, double width){
      super(height, width);
   }


   public String toString(){
      return "All Season Tire";
   }
}
