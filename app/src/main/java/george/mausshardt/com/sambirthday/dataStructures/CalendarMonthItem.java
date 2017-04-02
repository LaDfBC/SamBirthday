package george.mausshardt.com.sambirthday.dataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import george.mausshardt.com.sambirthday.enums.Month;

/**
 * Created by George on 10/24/2016
 */

public class CalendarMonthItem {
    private String name;
    private ArrayList<CalendarDayItem> items;

    public CalendarMonthItem(String name) {
        items = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ArrayList<CalendarDayItem> getItems() {
        return items;
    }

    public void setItems(CalendarDayItem... incomingItems) {
        items.clear();
        Collections.addAll(items, incomingItems);
    }
}
