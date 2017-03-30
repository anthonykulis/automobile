package edu.jalc.automobile.parts.suspension;

public class StockWheelTest {

    public void testGetSize(){
        System.out.println("Testing ForgedWheel::getHeight");
        StockWheel stockWheel = new StockWheel(30);
        assert(stockWheel.getSize() == 30);
    }

    public static void main(String[] args){
        StockWheelTest test = new StockWheelTest();
        test.testGetSize();
        System.out.println("All Tests for SteelWheel Passed");
    }

}
