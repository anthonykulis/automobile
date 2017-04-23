package edu.jalc.automobile.parts.suspension;

public abstract class Tire  {
	public double height;
	public double width;

	public Tire(double height, double width){
		this.height = height;
		this.width = width;
	}

	public double getHeight(){
		return height;
	}

	public double getWidth(){
		return width;
	}
}
