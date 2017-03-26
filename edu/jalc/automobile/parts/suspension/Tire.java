package edu.jalc.automobile.parts.suspension;

import edu.jalc.automobile.onlinebuilder.components.suspension.Suspension;

public abstract class Tire extends Suspension {
	private double height;
	private double width;

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