package collections;

/**
 *
 * @author https://www.jagokoding.id
 */
import java.io.*;
import java.util.*;

public class DemoLinkedList {

    public static void main(String[] args) {

        // Mendeklarasikan LinkedList
        LinkedList<Integer> ll
                = new LinkedList<Integer>();

        // Menambahkan elemen baru
        for (int i = 1; i <= 5; i++) {
            ll.add(i);
        }

        // Print element
        System.out.println(ll);

        // Hapus elemen indek ke 3
        ll.remove(3);

        // Menampilkan daftar linkedlist
        System.out.println(ll);

        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
    }
}