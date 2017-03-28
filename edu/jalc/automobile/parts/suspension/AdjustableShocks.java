package edu.jalc.automobile.parts.suspension;

public class AdjustableShocks extends Shock {

   private AdjustableShocks(){
      super(0);
   }

   public AdjustableShocks(double height){
      super(height);
   }


   public String toString(){
      return this.getHeight() + "in Adjustable Shocks";
   }
}
