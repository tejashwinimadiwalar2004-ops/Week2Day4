
import java.util.HashMap;

public class Student{
    public static void main(String[] args) {
        HashMap <String,String> HM = new HashMap<>();
        HM.put("Teja", "95");
        HM.put("Anu", "95");
        HM.put("Vaishu","98");
        HM.put("Manju", "85");
        HM.put("Mahantu", "85");
      System.out.println(HM);
       System.out.println(HM.get("Teja"));
        System.out.println(HM);
         HM.clear(); 
         System.out.println(HM);
   
    }
}