package edu.jalc.automobile.parts.sportlineparts;

public class TorqueVectorDifferentialTest{

  public void testTorqueVectorDifferential(){
    System.out.println("Testing TorqueVectorDifferential: :toString");
    TorqueVectorDifferential torqueVectorDifferential = new TorqueVectorDifferential();
    assert(torqueVectorDifferential.toString().equals("TorqueVectorDifferential"));
  }

  public static void main(String... args){
    TorqueVectorDifferentialTest torqueVectorDifferentialTest = new TorqueVectorDifferentialTest();
    torqueVectorDifferentialTest.testTorqueVectorDifferential();
    System.out.println("TorqueVectorDifferential Test Passed");
  }
}
