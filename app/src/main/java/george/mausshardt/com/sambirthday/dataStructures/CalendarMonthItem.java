package george.mausshardt.com.sambirthday.dataStructures;

import java.util.ArrayList;

/**
 * Created by George on 10/24/2016
 */

public class CalendarMonthItem {
    private String name;
    private ArrayList<CalendarDayItem> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<CalendarDayItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<CalendarDayItem> items) {
        this.items = items;
    }
}
