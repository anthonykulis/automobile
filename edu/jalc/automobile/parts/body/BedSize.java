package edu.jalc.automobile.parts.body;

public class BedSize{
  private int length;
  private int width;

  public BedSize(int length, int width){
    this.length = length;
    this.width = width;
  }

  public String toString(){
    return "Bed: " + length + "x" + width;
  }
}
