package george.mausshardt.com.sambirthday.content;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import george.mausshardt.com.sambirthday.dataStructures.CalendarTimelineItem;

/**
 * Created by George on 10/29/2016
 */

public class StartupLoader {
    private Calendar calendar;

    public StartupLoader() {
        calendar = Calendar.getInstance(Locale.US);
        calendar.setTime(new Date(System.currentTimeMillis()));
    }

    public ArrayList<CalendarTimelineItem> buildCalendar() {

    }

}
