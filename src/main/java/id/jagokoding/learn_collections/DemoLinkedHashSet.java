package collections;

/**
 *
 * @author https://www.jagokoding.id
 */
import java.util.*;

public class DemoLinkedHashSet {

    public static void main(String args[]) {

        LinkedHashSet<String> hs = new LinkedHashSet<String>();

        hs.add("JAGO");
        hs.add("KODING");
        hs.add("JAGO");

        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
