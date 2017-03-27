package edu.jalc.automobile.parts.suspension;

/**
 * Created by Nick on 3/26/2017.
 */
public class StockTireTest {

    public void testGetHeight(){
        System.out.println("Testing SportTire::getHeight");
        SportTire sportTire = new SportTire(30,0);
        assert(sportTire.getHeight() == 30);
    }
    public void testGetWidth(){
        System.out.println("Testing SportTire::getWidth");
        StockTire stockTire = new StockTire(0,30);
        assert(stockTire.getWidth() == 30);
    }

    public static void main(String[] args){
        StockTireTest test = new StockTireTest();

        test.testGetHeight();
        test.testGetWidth();

        System.out.println("All Tests for StockTireTest Passed");
    }

}
