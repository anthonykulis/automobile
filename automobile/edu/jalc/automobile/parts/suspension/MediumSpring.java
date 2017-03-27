package edu.jalc.automobile.parts.suspension;

public class MediumSpring extends Spring{

  public MediumSpring(double height) {
    super(height);
  }

   public String toString(){
      return this.getHeight() + " inch Coil Spring";
   }
}
