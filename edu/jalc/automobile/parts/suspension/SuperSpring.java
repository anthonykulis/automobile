package jalc.automobile.parts.suspension;

public class SuperSpring extends Spring{

   private final double height = 12;

   public SuperSpring(){

   }
   
   public double getHeight(){
      return height;
   }
   
   public String toString(){
      return "Super Leaf Spring: " + getHeight() + " inches";
   }
}
   