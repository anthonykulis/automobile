package edu.jalc.automobile.parts.suspension;

public class StockTire extends Tire{


    private StockTire(){
        super(0,0);
    }

    public StockTire(double height, double width){
        super(height,width);
    }

    public String toString(){
        return "Stock Tire";
    }
}
