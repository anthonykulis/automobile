package edu.jalc.automobile.parts.suspension;

public abstract class Wheel {

	private double size;
	private Tire tire;

	public Wheel(double size, Tire tire){
		this.size = size;
		this.tire = tire;
	}

	public double getSize(){ return this.size; }
	public Tire getTire(){ return this.tire; }
}
