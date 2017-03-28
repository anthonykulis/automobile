package edu.jalc.automobile.parts.suspension;

public class ShortSpring extends Spring{

   public ShortSpring(double height) {
      super(height);
   }


   public String toString(){
      return getHeight()+ "in Short Coil Spring";
   }
}
