
import java.util.HashMap;

public class PBook {
    public static void main(String[] args) {
        HashMap <String,String> book = new HashMap<>();
        book.put("Rahul", "218465");
        book.put("Teja", "13984654");
        book.put("Vaishu", "2654685");
        book.put("Tina", "65459544");
        book.put("Sana", "18464654");
        System.out.println(book);
        System.out.println(book.containsKey("Rahul"));
        System.out.println(book);

    }
}
