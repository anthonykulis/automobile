package edu.jalc.automobile.parts.body.colors;

import edu.jalc.automobile.parts.body.Paint;

public class BrightGreen extends Paint{

   public BrightGreen(){
      //forcing this to be Hills Green
      super("Bright Green");
   }


   private BrightGreen(String paint){
      super(null);
   }
}
