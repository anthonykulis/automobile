package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.seat;

import edu.jalc.automobile.parts.body.seat.LeatherSeat;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.color.*;

public class HighPerformanceSeat extends LeatherSeat{

  private Color color;
  private String description;

  public HighPerformanceSeat(Color color, String description){
    this.color = color;
    this.description = description;
  }

  public String toString(){
    return String.format("%s %s High Performance Seats", this.color, this.description);
  }

}
