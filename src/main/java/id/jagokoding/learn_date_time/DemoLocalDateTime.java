package id.jagokoding.learn_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;

/**
 *
 * @author https://www.jagokoding.id
 */
public class DemoLocalDateTime {

    public static void main(String[] args) {

        //Tanggal sekarang
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Tanggal sekarang = " + today);

        //Tanggal Saat Ini menggunakan LocalDate dan LocalTime
        today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("DateTime saat ini =" + today);

        //Membuat LocalDateTime dengan memberikan argumen input
        LocalDateTime specificDate = LocalDateTime.of(2014, Month.JANUARY, 1, 10, 10, 30);
        System.out.println("Specific Date=" + specificDate);

        // Coba buat tanggal dengan memberikan masukan yang tidak valid
        // LocalDateTime feb29_2014 = LocalDateTime.of (2014, Month.FEBRUARY, 28, 25,1,1);
        // Pengecualian di thread "main" java.time.DateTimeException:
        // Nilai tidak valid untuk HourOfDay (nilai valid 0 - 23): 25
        // Tanggal saat ini di "Asia / Jakarta", Anda bisa mendapatkannya dari ZoneId javadoc
        LocalDateTime todayJakarta = LocalDateTime.now(ZoneId.of("Asia/Jakarta"));
        System.out.println("Tanggal Saat Ini di IST = " + todayJakarta);

        //java.time.zone.ZoneRulesException: ID zona waktu tidak diketahui: IST
        // LocalDateTime todayIST = LocalDateTime.now (ZoneId.of ("IST"));
        // Mendapatkan tanggal dari tanggal dasar yaitu 01/01/1970
        LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(10000, 0, ZoneOffset.UTC);
        System.out.println("10.000 detik dari 01/01/1970= " + dateFromBase);

    }

}
