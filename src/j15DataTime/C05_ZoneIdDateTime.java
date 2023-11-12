package j15DataTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C05_ZoneIdDateTime {
    public static void main(String[] args) {
        //herhangi bir ülke şehir (local) tarih zamn datasını tutar

        LocalDate usatime=LocalDate.now (ZoneId.of("America/New_York"));
        System.out.println(usatime);
        ZonedDateTime zdf=ZonedDateTime.now(ZoneId.of("Japan"));
        System.out.println(zdf);

    }
}
