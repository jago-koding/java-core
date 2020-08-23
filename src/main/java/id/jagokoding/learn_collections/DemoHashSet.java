package collections;

/**
 *
 * @author https://www.jagokoding.id
 */
import java.util.*;

public class DemoHashSet {

    public static void main(String args[]) {
        
        HashSet<String> hs = new HashSet<String>();

        hs.add("JAGO");
        hs.add("KODING");

        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
