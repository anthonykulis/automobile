package edu.jalc.automobile.parts.suspension;

public class HeavySpring extends Spring{

   private HeavySpring(){
      super(0);
   }
   
   public HeavySpring(double height){
      super(height);
   }

   public String toString(){
      return "Heavy Coil Spring: "+ this.getHeight() + " inches";
   }
}
   