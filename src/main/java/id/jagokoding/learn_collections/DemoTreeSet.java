package collections;

/**
 *
 * @author https://www.jagokoding.id
 */
import java.util.*;

public class DemoTreeSet {

    public static void main(String args[]) {
        // Membuat TreeSet dan
        // menambahkan elemen
        TreeSet<String> ts
                = new TreeSet<String>();

        ts.add("JAGO");
        ts.add("KODING");
        ts.add("FULL STACK");
        ts.add("DEVELOPER");
        ts.add("JAGO");

        // Iterasi elemen
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
