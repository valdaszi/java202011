package e03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class LocalDateDemo {

    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        Date date2 = new Date("1/15/2020");

        System.out.println("date=" + date);
        System.out.println("date2=" + date2);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
        System.out.println("suformatuota=" + simpleDateFormat.format(date));

        LocalDateTime date3 = LocalDateTime.now();
        System.out.println("date3=" + date3);

        LocalDateTime date31 = date3.plusDays(1);
        System.out.println("date31=" + date31);


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        System.out.println("suformatuota=" + dateTimeFormatter.format(date3));

        dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withZone(ZoneId.systemDefault());
        System.out.println("suformatuota=" + dateTimeFormatter.format(date3));


        // Formatteriai naudojami ir datos dekodavimui (parsinimui) is tekstines eilutes
        Date date4 = simpleDateFormat.parse("2020-12-31 23:13:43 +0200");
        System.out.println("date4=" + date4);

    }
}
