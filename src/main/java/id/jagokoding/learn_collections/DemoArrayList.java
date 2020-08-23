package collections;

/**
 *
 * @author https://www.jagokoding.id
 */
// Java program to demonstrate the 
// working of ArrayList in Java 
import java.io.*;
import java.util.*;

public class DemoArrayList {

    public static void main(String[] args) {

        // Mendeklarasikan ArrayList dengan size awal n
        ArrayList<Integer> al  = new ArrayList<Integer>();

        // Menambahkan elemen baru
        for (int i = 1; i <= 5; i++) {
            al.add(i);
        }

        // Print elements 
        System.out.println(al);

        // Hapus elemen index ke 3
        al.remove(3);

        // Menampilkan daftar element 
        System.out.println(al);

        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }
}
