package edu.jalc.automobile.parts.suspension;

public class LightSpring extends Spring{

   public LightSpring(){
      super(0);
   }

   public LightSpring(double height){
      super(height);
   }

   public String toString(){
      return "Light Coil Spring: " + getHeight() + " inches";
   }
}
   