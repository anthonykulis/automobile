package edu.jalc.automobile.parts.body.colors;

import edu.jalc.automobile.parts.body.Paint;

public class TreeGreen extends Paint{
    
   public TreeGreen(){
      //forcing this to be Tree bGreen
      super("Tree Green");
   }
   
   
   private TreeGreen(String paint){
      super(null);
   }
}