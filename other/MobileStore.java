import java.util.ArrayList;

public class MobileStore {  
   private ArrayList<Mobile> mobiles;  
   
   public MobileStore(ArrayList<Mobile> mobiles) {  
      this.mobiles = mobiles;  
   }  
   
   public ArrayList<Mobile> getTotalMobileInStore() {  
      return this.mobiles;  
   }  
}
