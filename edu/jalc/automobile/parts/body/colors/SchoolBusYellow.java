package edu.jalc.automobile.parts.body.colors;

import edu.jalc.automobile.parts.body.Paint;

public class SchoolBusYellow extends Paint{
    
   public SchoolBusYellow(){
      //forcing this to be School Bus Yellow
      super("School Bus Yellow");
   }
   
   
   private SchoolBusYellow(String paint){
      super(null);
   }
}