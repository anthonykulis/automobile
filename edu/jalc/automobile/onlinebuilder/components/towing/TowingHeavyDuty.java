public class TowingHeavyDuty extends Towing{

   private HeavyShock shock;
   private HeavySpring spring;
   
   private TowingHeavyDuty(){
      this.shock = null;
      this.spring = null;
   }
   
   public TowingHeavyDuty(HeavyShock shock, HeavySpring spring){
      this.shock = shock;
      this.spring = spring;
   }
   
   public String toString(){
      return shock.toString() + ", " + spring.toString();
   }
   
}