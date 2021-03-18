import java.time.DayOfWeek;
import java.time.LocalDate;

public class Date_Time_API_Ex_3 {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();

        System.out.println(toCheckFriday(localDate));

    }
    public static boolean toCheckFriday(LocalDate date)
    {
//        date.plusDays(1);
        System.out.println(date.getDayOfWeek());
        if(date.getDayOfWeek()==DayOfWeek.THURSDAY)
        {
            return true;
        }
        return false;
    }
}

https://github.com/kirtan2312/collection/blob/main/src/Snapshots/Date_Time_API_Ex_3.png
