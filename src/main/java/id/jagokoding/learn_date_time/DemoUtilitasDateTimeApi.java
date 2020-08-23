package id.jagokoding.learn_date_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author https://www.jagokoding.id
 */
public class DemoUtilitasDateTimeApi {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        //Dapatkan Tahunnya, periksa apakah itu tahun kabisat
        System.out.println("Tahun " + today.getYear() + " adalah tahun kabisat? " + today.isLeapYear());

        //Bandingkan dua LocalDate sebelum dan sesudah
        System.out.println("Hari ini sebelum 01/01/2020? " + today.isBefore(LocalDate.of(2020, 1, 1)));

        //Buat LocalDateTime dari LocalDate
        System.out.println("Waktu saat ini = " + today.atTime(LocalTime.now()));

        //operasi plus dan minus
        System.out.println("10 hari setelah hari ini " + today.plusDays(10));
        System.out.println("3 minggu setelah hari ini " + today.plusWeeks(3));
        System.out.println("20 bulan setelah hari ini " + today.plusMonths(20));

        System.out.println("10 hari sebelum hari ini " + today.minusDays(10));
        System.out.println("3 minggu sebelum hari ini " + today.minusWeeks(3));
        System.out.println("20 bulan sebelum hari ini " + today.minusMonths(20));

        //Pengaturan temporal untuk menyesuaikan tanggal
        System.out.println("Tanggal pertama bulan ini = " + today.with(TemporalAdjusters.firstDayOfMonth()));
        LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("Tanggal terakhir tahun ini = " + lastDayOfYear);

        Period period = today.until(lastDayOfYear);
        System.out.println("Format Periode = " + period);
        System.out.println("Bulan yang tersisa dalam tahun ini = " + period.getMonths());
    }
}
