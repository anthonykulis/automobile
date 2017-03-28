package edu.jalc.automobile.parts.suspension;

public class ExtendedShocks extends Shock {

   public ExtendedShocks(double height){
      super(height);
   }

   public String toString(){
      return getHeight() + "in extended shocks";
   }
}
