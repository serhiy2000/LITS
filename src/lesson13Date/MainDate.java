package lesson13Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class MainDate {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2019,12,1);

        System.out.println(localDate);

        ZoneId zoneId = ZoneId.of("Egypt");
        LocalTime time = LocalTime.now(zoneId);
//        System.out.println(time);
//        System.out.println(time.plus(11));
//        System.out.println(ZoneId.getAvailableZoneIds());

        LocalDate localDate1 = LocalDate.of(2012, 12, 12);
        LocalTime localTime = LocalTime.of(12,12,12);
//        System.out.println(localDate1 +"\n"+ localTime);

        LocalDateTime localDateTime = LocalDateTime.of(2012,12,12,12,12,12);

//        System.out.println(localDateTime);

//        ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);


//        Date date = new Date(2012,12,12,12,12,12);
//        Date beginning =
//        System.out.println(date);
    }
}
