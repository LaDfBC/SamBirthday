package george.mausshardt.com.sambirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;

import george.mausshardt.com.sambirthday.dataStructures.CalendarGroupItem;
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


    }
}
