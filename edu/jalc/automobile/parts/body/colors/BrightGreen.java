package edu.jalc.automobile.parts.body.colors;
import edu.jalc.automobile.parts.body.Paint;

public class BrightGreen extends Paint{
  public BrightGreen(){
    //Forcing this to be Bright Green
    super("Bright Green");
  }
  private BrightGreen(String paint){
    super(null);
  }
}
