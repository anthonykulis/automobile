package jalc.automobile.parts.suspension;

public class AlloyWheel extends Wheel{

   private double size;
   private Tire tire;
   
   private AlloyWheel(){
      this.size = 0;
      this.tire = null;
      
   }
   
   public AlloyWheel(double size, Tire tire){
      this.size = size;
      this.tire = tire;
   }
   
   public double getSize(){
      return size;
   }
   
   public Tire getTire(){
      return tire;
   }
   
   public String toString(){
      return "Alloy Wheel with " + tire.toString();
   }
}