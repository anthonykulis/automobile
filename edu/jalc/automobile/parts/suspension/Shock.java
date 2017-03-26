package edu.jalc.automobile.parts.suspension;

public abstract class Shock{

	private double height;

	public Shock(double height){
		this.height = height;
	}

	public double getHeight(){ return height; }
}