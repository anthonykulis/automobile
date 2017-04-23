package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.cabin;

import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.seating.TruckSeat;
import edu.jalc.automobile.parts.body.seat.Seat;
import edu.jalc.automobile.parts.body.Cabin;

public class TruckCabin extends Cabin{
private TruckSeat seat;

   public TruckCabin(TruckSeat seat){
      super(seat);
      this.seat=seat;
   }
   public TruckSeat getSeat(){
      return seat;
   }
   public String toString(){
      return  getSeat().toString();
   }
}
