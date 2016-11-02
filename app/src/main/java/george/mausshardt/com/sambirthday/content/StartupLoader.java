package george.mausshardt.com.sambirthday.content;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import george.mausshardt.com.sambirthday.dataStructures.CalendarMonthItem;
import george.mausshardt.com.sambirthday.dataStructures.CalendarTimelineItem;
import george.mausshardt.com.sambirthday.enums.Month;

/**
 * Created by George on 10/29/2016
 */

public class StartupLoader {
    private Calendar calendar;
    private Month currentMonth;

    public StartupLoader() {
        calendar = Calendar.getInstance(Locale.US);
        calendar.setTime(new Date(System.currentTimeMillis()));
    }

    public ArrayList<CalendarTimelineItem> buildCalendar() {
        int month = calendar.get(Calendar.MONTH);
        switch(month) {
            case 1:
                currentMonth = Month.JANUARY;
                break;
            case 2:
                currentMonth = Month.FEBRUARY;
                break;
            case 3:
                currentMonth = Month.MARCH;
                break;
            case 4:
                currentMonth = Month.APRIL;
                break;
            case 5:
                currentMonth = Month.MAY;
                break;
            case 6:
                currentMonth = Month.JUNE;
                break;
            case 7:
                currentMonth = Month.JULY;
                break;
            case 8:
                currentMonth = Month.AUGUST;
                break;
            case 9:
                currentMonth = Month.SEPTEMBER;
                break;
            case 10:
                currentMonth = Month.OCTOBER;
                break;
            case 11:
                currentMonth = Month.NOVEMBER;
                break;
            case 12:
                currentMonth = Month.DECEMBER;
                break;
            default:
                System.out.println("This month doesn't exist.  But why?");
        }

        List<Month> pastMonths = currentMonth.getPreviousMonths();

        List<CalendarTimelineItem> actualCalendar = new ArrayList<>();


        CalendarMonthItem currentMonthItem;
        if(!pastMonths.isEmpty()) {
            CalendarTimelineItem pastItems = new CalendarTimelineItem();
            for(Month currentMonth : pastMonths) {
                currentMonthItem = new CalendarMonthItem(currentMonth.getDisplayName());
                pastItems.addItem(currentMonthItem);

                //TODO: Add the past daily notes
            }
        }
    }

}
