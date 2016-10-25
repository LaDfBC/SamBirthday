package george.mausshardt.com.sambirthday;

import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;

import george.mausshardt.com.sambirthday.dataStructures.CalendarGroupItem;
import george.mausshardt.com.sambirthday.dataStructures.CalendarListItem;
import george.mausshardt.com.sambirthday.dataStructures.CalendarListViewAdapter;

public class MainCalendar extends AppCompatActivity {

    private CalendarListViewAdapter mainAdapter;
    private ArrayList<CalendarGroupItem> calendarGroups;
    private ExpandableListView expandableList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);

        expandableList = (ExpandableListView) findViewById(R.id.calendar);
        calendarGroups = setStandardGroups();
        mainAdapter = new CalendarListViewAdapter(this, calendarGroups);
        expandableList.setAdapter(mainAdapter);
    }

    private ArrayList<CalendarGroupItem> setStandardGroups() {
        ArrayList<CalendarGroupItem> outerList = new ArrayList<>();
        ArrayList<CalendarListItem> innerList = new ArrayList<>();
        CalendarGroupItem item1 = new CalendarGroupItem();
        item1.setName("Passed");

        CalendarGroupItem item2 = new CalendarGroupItem();
        item2.setName("Present");

        CalendarListItem month = new CalendarListItem();
        month.setName("January");

        CalendarListItem month2 = new CalendarListItem();
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
