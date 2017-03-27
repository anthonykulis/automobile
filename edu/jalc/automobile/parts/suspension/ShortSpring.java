package edu.jalc.automobile.parts.suspension;

public class ShortSpring extends Spring{

   public ShortSpring(double height) {
      super(height);
   }


   public String toString(){
      return this.getHeight()+ " inch Coil Spring";
   }
}
