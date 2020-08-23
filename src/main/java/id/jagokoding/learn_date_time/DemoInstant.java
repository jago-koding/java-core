package id.jagokoding.learn_date_time;

import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author https://www.jagokoding.id
 */
public class DemoInstant {

    public static void main(String[] args) {
        //TimeStamp saat ini
        Instant timestamp = Instant.now();
        System.out.println("TimeStamp saat ini = " + timestamp);

        //Spesifik Instan
        Instant specificTime = Instant.ofEpochMilli(timestamp.toEpochMilli());
        System.out.println("Spesifik instant = " + specificTime);

        //Contoh dengan durasi
        Duration tigaPuluhHari = Duration.ofDays(30);
        System.out.println(tigaPuluhHari);
    }

}
