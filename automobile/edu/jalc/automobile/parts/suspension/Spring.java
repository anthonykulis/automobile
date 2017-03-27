package edu.jalc.automobile.parts.suspension;

public abstract class Spring{

	private double height;

	public Spring(double height){
		this.height = height;
	}

	public double getHeight(){
		return this.height;
	}
}