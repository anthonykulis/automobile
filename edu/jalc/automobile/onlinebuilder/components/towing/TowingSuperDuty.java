public class TowingSuperDuty extends Towing{

   private SuperShock shock;
   private SuperSpring spring;
   
   private TowingSuperDuty(){
      this.shock = null;
      this.spring = null;
   }
   
   public TowingSuperDuty(SuperShock shock, SuperSpring spring){
      this.shock = shock;
      this.spring = spring;
   }
   
   public String toString(){
      return shock.toString() + ", " + spring.toString();
   }
   
}