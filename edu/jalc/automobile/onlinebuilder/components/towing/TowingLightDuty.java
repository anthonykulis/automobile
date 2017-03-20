public class TowingLightDuty extends Towing{

   private Shock shock;
   private Spring spring;
   
   private TowingLightDuty(){
      this.shock = null;
      this.spring = null;
   }
   
   public TowingLightDuty(Shock shock, Spring spring){
      this.shock = shock;
      this.spring = spring;
   }
   
   public String toString(){
      return shock.toString() + ", " + spring.toString();
   }
   
}