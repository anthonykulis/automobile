package edu.jalc.automobile.parts.body;

public class CrewCabin extends CabSize{
  private int cabFeet;
  private int cabInch;

  public CrewCabin(int cabFeet, int cabInch){
    super("Crew", cabFeet, cabInch);
  }
}
