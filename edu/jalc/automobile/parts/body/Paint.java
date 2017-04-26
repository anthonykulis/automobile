package edu.jalc.automobile.parts.body;
import edu.jalc.automobile.parts.body.colors.BrightRed;

public class Paint{
   public String name;

   public Paint(String name){
      this.name = name;
   }
   public String toString(){
      return name;
   }

   public String getName() {
      return name;
   }
}
