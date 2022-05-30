import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class JavaDateAndTime {
    public static void main(String... arg){
        System.out.println(findDay(5,8,2015));
    }

    public static String findDay(int month, int day, int year){
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.DAY_OF_MONTH, day);

        return new SimpleDateFormat("EEEE").format(cal.getTime()).toUpperCase();
    }
}
