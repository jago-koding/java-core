package id.jagokoding.learn_date_time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 *
 * @author https://www.jagokoding.id
 */
public class DemoLegacySupport {

    public static void main(String[] args) {
        //Date ke Instant
        Instant timestamp = new Date().toInstant();
        //Sekarang kita dapat mengonversi Instan ke LocalDateTime atau kelas serupa lainnya
        LocalDateTime date = LocalDateTime.ofInstant(timestamp,
                ZoneId.of(ZoneId.SHORT_IDS.get("PST")));

        System.out.println("Date = " + date);

        //Calendar ke Instant
        Instant time = Calendar.getInstance().toInstant();

        System.out.println(time);
        //TimeZone ke ZoneId
        ZoneId defaultZone = TimeZone.getDefault().toZoneId();

        System.out.println(defaultZone);

        //ZonedDateTime dari Calendar tertentu
        ZonedDateTime gregorianCalendarDateTime = new GregorianCalendar().toZonedDateTime();

        System.out.println(gregorianCalendarDateTime);

        Date dt = Date.from(Instant.now());

        System.out.println(dt);

        TimeZone tz = TimeZone.getTimeZone(defaultZone);

        System.out.println(tz);

        GregorianCalendar gc = GregorianCalendar.from(gregorianCalendarDateTime);

        System.out.println(gc);

    }

}
