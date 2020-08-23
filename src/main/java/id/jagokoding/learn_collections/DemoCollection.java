package collections;

/**
 *
 * @author https://www.jagokoding.id
 */
import java.io.*;
import java.util.*;

class DemoCollection {

    public static void main(String[] args) {
        // Membuat instance dari array, vektor dan hashtable
        int arr[] = new int[]{1, 2, 3, 4};
        Vector<Integer> v = new Vector();
        Hashtable<Integer, String> h
                = new Hashtable();

        // Menambahkan elemen ke dalam vektor
        v.addElement(1);
        v.addElement(2);

        // Menambahkan elemen ke dalam hashtable
        h.put(1, "geeks");
        h.put(2, "4geeks");

        // Pembuatan instance array dengan kurung siku[],
        // sedangkan Vector dan hastable dengan kurung buka ()
        // Penyisipan elemen vektor membutuhkan addElement (),
        // tetapi penyisipan elemen hashtable membutuhkan put ()
        // Mengakses elemen pertama dari
        // array, vektor, dan hashtable
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));

        // Elemen array diakses menggunakan [],
        // elemen vektor menggunakan elementAt ()
        // dan elemen hashtable menggunakan get ()
    }
}
