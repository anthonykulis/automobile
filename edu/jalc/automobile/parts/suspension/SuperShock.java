package edu.jalc.automobile.parts.suspension;

public class SuperShock extends Shock{

   public SuperShock(double height){ super(height); }
   public String toString(){
      return getHeight() + "in Super Shock";
   }
}