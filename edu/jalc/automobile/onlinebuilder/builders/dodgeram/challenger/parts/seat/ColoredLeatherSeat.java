package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.seat;

import edu.jalc.automobile.parts.body.seat.LeatherSeat;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.color.Color;

public class ColoredLeatherSeat extends LeatherSeat{

  private Color color;
  private String description;

  public ColoredLeatherSeat(Color color, String description){
    super();
    this.color = color;
    this.description = description;
  }

  public String toString(){
    return String.format("%s %s Leather Seat", this.color, this.description);
  }
}
