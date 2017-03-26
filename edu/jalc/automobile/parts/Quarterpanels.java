package edu.jalc.automobile.parts;

import edu.jalc.automobile.parts.Paint;
import edu.jalc.automobile.parts.Graphic;

public class Quarterpanels{
   private Paint paint;
   private Graphic graphic;

   private Quarterpanels(){
      this.paint = null;
      this.graphic = null;
   }

   public Quarterpanels(Paint paint, Graphic graphic){
      this.setPaint(paint);
      this.setGraphic(graphic);
   }

   public Paint getPaint(){
      return this.paint;}

   Paint setPaint(Paint paint){
      this.paint = paint;
      return this.paint;
   }

   public Graphic getGraphic(){
      return this.graphic;}

   Graphic setGraphic(Graphic graphic){
      this.graphic = graphic;
      return this.graphic;
   }

   public String toString(){
      return "Quarterpanels has:\n" +
                       "\t"+ paint+"\n"+
                       "\t"+ graphic; 
   }
}