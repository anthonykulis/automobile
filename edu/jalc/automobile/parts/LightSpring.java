public class LightSpring extends Spring{

   private double height;
   
   private LightSpring(){
      this.height = 0;
   }
   
   public LightSpring(double height){
      this.height = height;
   }
   
   public String toString(){
      return "Light Coil Spring";
   }
}
   