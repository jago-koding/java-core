package id.jagokoding.learn_date_time;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

/**
 *
 * @author https://www.jagokoding.id
 */

public class DemoLocalDate {

    public static void main(String[] args) {

        //Tanggal Sekarang
        LocalDate tangalSekarang = LocalDate.now();
        System.out.println("Tanggal Sekarang = " + tangalSekarang);

        //Membuat LocalDate dengan memberikan argumen input
        LocalDate spesifikDate = LocalDate.of(2019, Month.JANUARY, 5);
        System.out.println("Tanggal spesifik = " + spesifikDate);

        //Coba buat tanggal dengan memberikan input yang tidak valid
        //LocalDate feb29_2014 = LocalDate.of(2014, Month.FEBRUARY, 29);
        // Exception di thread "main" java.time.DateTimeException:
        // Tanggal tidak valid '29 Februari' karena '2014' bukanlah tahun kabisat
        //Tanggal sekarang di "Asia / Jakarta", Anda bisa mendapatkannya dari ZoneId javadoc
        LocalDate tanggalSaatIniJakarta = LocalDate.now(ZoneId.of("Asia/Jakarta"));
        System.out.println("Tanggal Saat Ini di IST = " + tanggalSaatIniJakarta);

        //java.time.zone.ZoneRulesException: ID zona waktu tidak diketahui: IST
        // LocalDate todayIST = LocalDate.now (ZoneId.of ("IST"));
        // Mendapatkan tanggal dari tanggal dasar yaitu 01/01/1970
        LocalDate tanggalDefault = LocalDate.ofEpochDay(365);
        System.out.println("Hari ke-365 dari tanggal default = " + tanggalDefault);

        LocalDate seratusHari2020 = LocalDate.ofYearDay(2020, 100);
        System.out.println("Seratus hari dari tahun 2020 = " + seratusHari2020);
    }

}
