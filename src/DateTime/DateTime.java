package DateTime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime {
    public static void main(String[] args) {
        int day, month, year;
        int second, minute, hour;

        GregorianCalendar data = new GregorianCalendar();

        day = data.get(Calendar.DAY_OF_MONTH);
        month = data.get(Calendar.MONTH);
        year = data.get(Calendar.YEAR);

        second = data.get(Calendar.SECOND);
        minute = data.get(Calendar.MINUTE);
        hour = data.get(Calendar.HOUR);

        System.out.println("Data is " + day + "/" + (month+1) + "/" + year);
        System.out.println("Data is " + hour + ":" + minute + "/" + second);

    }
}

