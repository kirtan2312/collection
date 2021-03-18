import java.time.*;


public class Date_Time_API_Ex_1 {

    public static void main(String[] args) {
        Year year=Year.of(2020);
        for(Month month: Month.values())
        {
            YearMonth year_month=YearMonth.of(2020,month);
            System.out.println(month.name()+":"+year_month.lengthOfMonth());
        }
    }
}

https://github.com/kirtan2312/collection/blob/main/src/Snapshots/Date_Time_API_Ex_1.png
