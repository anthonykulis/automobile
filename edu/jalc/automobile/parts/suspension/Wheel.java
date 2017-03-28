package edu.jalc.automobile.parts.suspension;

public abstract class Wheel {

	private double size;

	public Wheel(double size){
		this.size = size;
	}

	public double getSize(){ return this.size; }
}
