package george.mausshardt.com.sambirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.Calendar;

import george.mausshardt.com.sambirthday.content.StartupLoader;
import george.mausshardt.com.sambirthday.dataStructures.CalendarTimelineItem;
import george.mausshardt.com.sambirthday.dataStructures.CalendarTimelineListViewAdapter;
import george.mausshardt.com.sambirthday.enums.Month;

public class MainCalendar extends AppCompatActivity {

    private CalendarTimelineListViewAdapter mainAdapter;
    private ArrayList<CalendarTimelineItem> calendarGroups;
    private ExpandableListView expandableList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);

        expandableList = (ExpandableListView) findViewById(R.id.calendar);
        calendarGroups = setStandardGroups();
        mainAdapter = new CalendarTimelineListViewAdapter(this, calendarGroups);
        expandableList.setAdapter(mainAdapter);
    }

    private ArrayList<CalendarTimelineItem> setStandardGroups() {
        //Past, present, and future
        ArrayList<CalendarTimelineItem> headings = new ArrayList<>();

        //Get current date
        Calendar calendar = StartupLoader.getCurrentDate();
        Month currentMonth = Month.fromMonthInteger(calendar.get(Calendar.MONTH));

        CalendarTimelineItem past = new CalendarTimelineItem("Past");
        past.setItemsAsMonths(Month.getPreviousMonths(currentMonth));

        CalendarTimelineItem present = new CalendarTimelineItem("Present");
        present.setItemAsSingletonMonth(currentMonth);

        CalendarTimelineItem future = new CalendarTimelineItem("Future");
        future.setItemsAsMonths(Month.getFutureMonths(currentMonth));

        headings.add(past);
        headings.add(present);
        headings.add(future);

        return headings;
    }
}
