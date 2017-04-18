package edu.jalc.automobile.parts.body.colors;
import edu.jalc.automobile.parts.body.Paint;

public class Yellow extends Paint{
  public Yellow(){
    //Forcing this to be Yellow
    super("Yellow");
  }
  private Yellow(String paint){
    super(null);
  }
}
