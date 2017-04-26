package edu.jalc.automobile.parts.body.colors;

import edu.jalc.automobile.parts.body.Paint;

public class BrightRed extends Paint{
    
   public BrightRed(){
      //forcing this to be Bright Red
      super("Bright Red");
   }
   
   
   private BrightRed(String paint){
      super(null);
   }
}
