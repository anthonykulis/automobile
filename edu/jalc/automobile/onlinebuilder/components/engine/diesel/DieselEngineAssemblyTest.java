
/*package edu.jalc.automobile.onlinebuilder.components.engine.diesel

import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class DieselEngineAssemblyTest{
  public static void main(String... args){
    System.out.print("testing Diesel Engine");
    testDisplacement();
    testHorsePower();
    testTorque();
    testCylinders();
    System.out.println(" - all tests passed");
  }

  public static void testDisplacement(){
    Engine engine = new DieselEngine(0,new HorsePower(0,0),new Torque(0,0),0);
    engine.setDisplacement(350);
    assert(engine.getDisplacement() == 350);
  }
  public static void testHorsePower(){
    Engine engine = new DieselEngine(0,new HorsePower(0,0),new Torque(0,0),0);
    HorsePower horsePower = new HorsePower(255,2800);
    engine.setHorsePower(horsePower);
    assert(engine.getHorsePower() == horsePower);
  }
  public static void testTorque(){
    Engine engine = new DieselEngine(0,new HorsePower(0,0),new Torque(0,0),0);
    Torque torque = new Torque(400,1950);
    engine.setTorque(torque);
    assert(engine.getTorque() == torque);
  }
  public static void testCylinders(){
    Engine engine = new DieselEngine(0,new HorsePower(0,0),new Torque(0,0),0);
    engine.setCylinders(4);
    assert(engine.getCylinders() == 4);
  }
}

*/