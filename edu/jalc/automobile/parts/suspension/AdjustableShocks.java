package jalc.automobile.parts.suspension;

public class AdjustableShocks extends Shock{

   private double height;

   private AdjustableShocks(){
      this.height = 0;
   }

   public AdjustableShocks(double height){
      this.height = height;
   }

   public double getHeight(){
      return height;
   }

   public String toString(){
      return height + " inch shocks";
   }
}
