package jalc.automobile.parts.suspension;

public class ShortShocks extends Shock{

   private final double height = 2;

   public double getHeight(){
      return height;
   }

   public String toString(){
      return height + " inch shocks";
   }
}
