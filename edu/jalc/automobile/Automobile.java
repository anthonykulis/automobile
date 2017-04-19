package edu.jalc.automobile;

import edu.jalc.automobile.onlinebuilder.components.body.Body;
import edu.jalc.automobile.onlinebuilder.components.driveline.DriveLine;
import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.suspension.Suspension;

public class Automobile {

	private String make;
	private String model;
	private String trim;
	private Body body;
	private DriveLine driveLine;
	private EngineAssembly engineAssembly;
	private Suspension suspension;

	private Automobile(){}

	public Automobile(String make, String model, String trim, Body body, DriveLine driveLine, EngineAssembly engineAssembly, Suspension suspension){
		this.make = make;
		this.model = model;
		this.trim = trim;
		this.body = body;
		this.driveLine = driveLine;
		this.engineAssembly = engineAssembly;
		this.suspension = suspension;
	}

	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Make: "+ this.make + "\n");
		builder.append("Model:" + this.model + "\n");
		builder.append("Trim:" + this.trim + "\n");
		builder.append("\n\n");
		builder.append(this.body + "\n");
		builder.append(this.engineAssembly + "\n");
		builder.append(this.suspension + "\n");
		builder.append(this.driveLine + "\n");
		return builder.toString();
	}
}
