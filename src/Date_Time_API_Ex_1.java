import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Date_Time_API_Ex_1 {

    public static void main(String[] args) {
        int year=Integer.parseInt(args[0]);
        Year y=Year.of(year);
        for(Month month: Month.values())
        {
            YearMonth year_month=YearMonth.of(year,month);
            System.out.println(month.name()+":"+year_month.lengthOfMonth());
        }
    }
}
o/p:https://github.com/kirtan2312/collection/blob/kirtan/src/Snapshots/Date_Time_API_Ex_1.png
