import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class Date_Time_API_Ex_2 {
    public static void main(String[] args){
        Month month= Month.MAY;
        LocalDate localDate=Year.now().atMonth(month).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        Month date_month=localDate.getMonth();
        while(date_month==month)
        {
            System.out.println(localDate+" : "+localDate.getDayOfWeek());
            localDate=localDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            date_month=localDate.getMonth();
        }
    }
}

https://github.com/kirtan2312/collection/blob/main/src/Snapshots/Date_Time_API_Ex_2.png
