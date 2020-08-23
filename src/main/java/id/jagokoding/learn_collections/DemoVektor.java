package collections;

/**
 *
 * @author https://www.jagokoding.id
 */
import java.io.*;
import java.util.*;

public class DemoVektor {

    public static void main(String[] args) {

        // Deklarasi vektor
        Vector<Integer> v = new Vector<Integer>();

        // Menambahkan elemen
        for (int i = 1; i <= 5; i++) {
            v.add(i);
        }

        // Print elemen
        System.out.println(v);

        // Hapus indek ke 3
        v.remove(3);

        // Menampilkan daftar vektor
        System.out.println(v);
 
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }
    }
}
