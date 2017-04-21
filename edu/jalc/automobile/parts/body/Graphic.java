package edu.jalc.automobile.parts.body;

public class Graphic{
  private String name;

  public Graphic(){

  }

  public Graphic(String name){
    this.name = name;
  }

  public String toString(){
    return "Graphic: " + this.name;
  }
}
