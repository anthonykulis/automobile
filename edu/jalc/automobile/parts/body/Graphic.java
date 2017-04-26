package edu.jalc.automobile.parts.body;

public class Graphic{
  public String name;

  public Graphic(){
  }

  public Graphic(String name){
    this.name = name;
  }

  public String toString(){
    return "Graphic: " + this.name;
  }
}
