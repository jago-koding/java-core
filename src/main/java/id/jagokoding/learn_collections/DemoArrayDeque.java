package collections;

/**
 *
 * @author https://www.jagokoding.id
 */
// Java program to demonstrate the 
// ArrayDeque class in Java 
import java.util.*;

public class DemoArrayDeque {

    public static void main(String[] args) {
        // Menginisialisasi deque
        ArrayDeque<Integer> dQ = new ArrayDeque<Integer>(10);

        // add() method to insert 
        dQ.add(10);
        dQ.add(20);
        dQ.add(30);
        dQ.add(40);
        dQ.add(50);

        System.out.println(dQ);

        // method clear()
        dQ.clear();

        // addFirst() untuk menyisipkan elemen di awal
        dQ.addFirst(564);
        dQ.addFirst(291);

        // addLast() untuk menyisipkan  elemen di akhir
        dQ.addLast(24);
        dQ.addLast(14);

        System.out.println(dQ);
    }
}
