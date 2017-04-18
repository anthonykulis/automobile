package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.cabin;

import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.cabin.Color;

public class Interior{

  Color color;
  String type;

  public Interior(Color color, String type){
    this.color = color;
    this.type = type;
  }
  public String toString(){
    return this.color + this.type + "Interior";
  }
}
