package edu.jalc.automobile.parts.suspension;

public class MediumSpring extends Spring{

  public MediumSpring(double height) {
    super(height);
  }

   public String toString(){
      return getHeight() + "in Medium Coil Spring";
   }
}
