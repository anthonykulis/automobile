package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.brake;

public class StandardBrakePad{

  private String description;

  public void StandardBrakePad(String description){
  this.description = description;
  }

  public String toString(){
    return this.description + "Standard Brake Pad";
  }
  
}
