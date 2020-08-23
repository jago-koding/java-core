package collections;

/**
 *
 * @author https://www.jagokoding.id
 */
import java.util.*;

public class DemoHashMap {

    public static void main(String args[]) {
        // Membuat HashMap dan
        // menambahkan elemen
        HashMap<Integer, String> hm
                = new HashMap<Integer, String>();

        hm.put(1, "JAGO");
        hm.put(2, "KODING");
        hm.put(3, "FULL STACK DEVELOPER");

        // Mencari nilai dengan key 1
        System.out.println("Value for 1 is " + hm.get(1));

        // Iterasi HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
