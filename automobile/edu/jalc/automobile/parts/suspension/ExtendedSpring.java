package edu.jalc.automobile.parts.suspension;

public class ExtendedSpring extends Spring{

    public ExtendedSpring(double height) {
        super(height);
    }


    public String toString(){
        return this.getHeight() + " inch Coil Spring";
     }
}
