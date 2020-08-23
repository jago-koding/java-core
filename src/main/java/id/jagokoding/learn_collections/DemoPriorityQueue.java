package collections;

/**
 *
 * @author https://www.jagokoding.id
 */
import java.util.*;

class DemoPriorityQueue {

    public static void main(String args[]) {
        // Membuat antrian prioritas kosong
        PriorityQueue<Integer> pQueue
                = new PriorityQueue<Integer>();

        // Menambahkan item ke Queue menggunakan add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        // Mencetak elemen teratas dari PriorityQueue
        System.out.println(pQueue.peek());

        // Mencetak elemen teratas dan menghapusnya
        // dari penampung PriorityQueue 
        System.out.println(pQueue.poll());

        // Mencetak elemen teratas lagi
        System.out.println(pQueue.peek());
    }
}
