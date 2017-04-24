package edu.jalc.automobile.parts.body;

public class {
  private String type;
  private int cabFeet;
  private int cabInch;

  public CabSize(String type, int cabFeet, int cabInch){
    this.type = type;
    this.cabFeet = cabFeet;
    this.cabInch = cabInch;
  }

  public String toString(){
    return type + " Cabin: " + cabFeet + "\'" + cabInch + "\"";
  }
}
