package collections;

/**
 *
 * @author https://www.jagokoding.id
 */
import java.util.*;

public class DemoStack {

    public static void main(String args[]) {
        Stack<String> stack = new Stack<String>();
        stack.push("JAGO");
        stack.push("KODING");
        stack.push("JAGO0");
        stack.push("KODING2");

        Iterator<String> itr
                = stack.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        stack.pop();

        itr = stack.iterator();

        // Print stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
