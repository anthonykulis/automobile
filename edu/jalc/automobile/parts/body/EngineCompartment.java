package edu.jalc.automobile.parts.body;

public class EngineCompartment{
  private Hood hood;

  public EngineCompartment(Hood hood){
    this.setHood(hood);
  }

  public Hood getHood(){return this.hood;}

  Hood setHood(Hood hood){
    this.hood = hood;
    return this.hood;
  }

  public String toString(){
    return "Adding hood to enginecompartment";
  }
}
