package edu.jalc.automobile.parts;

public class Graphic{
  private String graphic;

  public Graphic(String graphic){
    this.graphic = graphic;
  }

  public String getGraphic(){return this.graphic;}

  String setGraphic(String graphic){
    this.graphic = graphic;
    return this.graphic;
  }

  public String toString(){
    return "Adding graphic";
  }
}
