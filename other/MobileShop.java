import java.util.ArrayList;

public class MobileShop {
   public static void main(String[] args) {   

      // create Mobile object
      Mobile mob1 = new Mobile("Realme6", "8GB", "128GB");  
      Mobile mob2 = new Mobile("SAMSUNG A21S", "4GB", "128GB");  
      Mobile mob3 = new Mobile("SAMSUNG M10", "4GB", "64GB");  

      // create ArrayList of Mobile and add mobile
      ArrayList<Mobile> mobiles = new ArrayList<Mobile>();  
      mobiles.add(mob1);  
      mobiles.add(mob2);  
      mobiles.add(mob3);  

      // create Mobile Store
      MobileStore store = new MobileStore(mobiles);  

      // get ArrayList of mobile  
      ArrayList<Mobile> mob = store.getTotalMobileInStore();  

      // display mobile information
      for (Mobile mb : mob) {  
         System.out.println("Name : " + mb.getName() + " RAM : " + mb.getRam() + " and ROM : " + mb.getRom());  
      }  
   }
}
