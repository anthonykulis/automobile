package edu.jalc.automobile.parts.body;

public class Hood{
  private Paint paint;
  private Graphic graphic;

  private Hood(){
    this.paint = null;
    this.graphic = null;
  }


  public Hood(Paint paint, Graphic graphic){
    this.setPaint(paint);
    this.setGraphic(graphic);
  }

  public Paint getPaint(){return this.paint;}

  Paint setPaint(Paint paint){
    this.paint = paint;
    return this.paint;
  }

  public Graphic getGraphic(){return this.graphic;}

  Graphic setGraphic(Graphic graphic){
    this.graphic = graphic;
    return this.graphic;
  }

 public String toString(){
    return "Hood with: " + paint.toString() + " " + graphic.toString(); 

  }

}
