package george.mausshardt.com.sambirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;

import george.mausshardt.com.sambirthday.dataStructures.CalendarMonthItem;
import george.mausshardt.com.sambirthday.dataStructures.CalendarDayItem;
import george.mausshardt.com.sambirthday.dataStructures.CalendarMonthListViewAdapter;

public class MainCalendar extends AppCompatActivity {

    private CalendarMonthListViewAdapter mainAdapter;
    private ArrayList<CalendarMonthItem> calendarGroups;
    private ExpandableListView expandableList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);

        expandableList = (ExpandableListView) findViewById(R.id.calendar);
        calendarGroups = setStandardGroups();
        mainAdapter = new CalendarMonthListViewAdapter(this, calendarGroups);
        expandableList.setAdapter(mainAdapter);
    }

    private ArrayList<CalendarMonthItem> setStandardGroups() {
        ArrayList<CalendarMonthItem> outerList = new ArrayList<>();
        ArrayList<CalendarDayItem> innerList = new ArrayList<>();
        CalendarMonthItem item1 = new CalendarMonthItem();
        item1.setName("Past");

        CalendarMonthItem item2 = new CalendarMonthItem();
        item2.setName("Present");

        CalendarDayItem month = new CalendarDayItem();
        month.setName("January");

        CalendarDayItem month2 = new CalendarDayItem();
        month2.setName("February");
        innerList.add(month);
        innerList.add(month2);

        item1.setItems(innerList);
        item2.setItems(innerList);

        outerList.add(item1);
        outerList.add(item2);

        return outerList;
    }
}
