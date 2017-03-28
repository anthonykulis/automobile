package edu.jalc.automobile.parts.suspension;

/**
 * Created by Nick on 3/27/2017.
 */
public class StockWheel extends Wheel{

    private StockWheel(){
        super(0);
    }

    public StockWheel(double size){
        super(size);
    }


    public String toString(){
        return "\tStock Wheel";
    }

}
