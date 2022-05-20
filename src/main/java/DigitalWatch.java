import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DigitalWatch {
    int hours = 0;
    int minutes = 0;
    int seconds = 0;
    String timeString = "";


    public String getTime() {

            Calendar cal = Calendar.getInstance();
            hours = cal.get(Calendar.HOUR_OF_DAY);
            if (hours > 12) hours -= 12;
            minutes = cal.get(Calendar.MINUTE);
            seconds = cal.get(Calendar.SECOND);

            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
            Date date = cal.getTime();
            timeString = formatter.format(date);

            return printTime();
    }

    public String printTime(){
        return timeString;
    }
}
