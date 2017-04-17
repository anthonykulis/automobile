package edu.jalc.automobile.parts.body;
import edu.jalc.automobile.parts.body.colors.BrightRed;

public class Paint{
   private String paint;

   public Paint(String paint){
      this.paint = paint;
   }

   public String getPaint(){
      return this.paint;}

   public String toString(){
      return "Paint is :\n" +
                        "\t"+paint;
   }
}
