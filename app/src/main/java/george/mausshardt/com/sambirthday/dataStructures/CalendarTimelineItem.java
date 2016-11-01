package george.mausshardt.com.sambirthday.dataStructures;

import java.util.ArrayList;

/**
 * Created by George on 10/29/2016
 */

public class CalendarTimelineItem {
    private String name;
    private ArrayList<CalendarMonthItem> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ArrayList<CalendarMonthItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<CalendarMonthItem> items) {
        this.items = items;
    }
}
