package id.jagokoding.learn_date_time;

import java.time.LocalTime;
import java.time.ZoneId;

/**
 *
 * @author https://www.jagokoding.id
 */

public class DemoLocalTime {

    public static void main(String[] args) {

        //Waktu saat ini
        LocalTime localTime = LocalTime.now();
        System.out.println("Waktu saat ini=" + localTime);

        //Membuat LocalTime dengan memberikan argumen input
        LocalTime specificLocalTime = LocalTime.of(12, 21, 40, 40);
        System.out.println("Waktu Tertentu = " + specificLocalTime);

        // Coba buat waktu dengan memberikan input yang tidak valid
        // LocalTime invalidTime = LocalTime.of (25,20);
        // Pengecualian di thread "main" java.time.DateTimeException:
        // Nilai tidak valid untuk HourOfDay (nilai valid 0 - 23): 25
        // Tanggal saat ini di "Asia / Jakarta", Anda bisa mendapatkannya dari ZoneId javadoc
        LocalTime localTimeJakarta = LocalTime.now(ZoneId.of("Asia/Jakarta"));
        System.out.println("Waktu Saat ini di IST = " + localTimeJakarta);

        //java.time.zone.ZoneRulesException: ID zona waktu tidak diketahui: IST
        // LocalTime todayIST = LocalTime.now (ZoneId.of ("IST"));
        // Mendapatkan tanggal dari tanggal dasar yaitu 01/01/1970
        LocalTime specificSecondLocalTime = LocalTime.ofSecondOfDay(10000);
        System.out.println("10000 detik dari waktu default =  " + specificSecondLocalTime);

    }

}
