package george.mausshardt.com.sambirthday.dataStructures;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by George on 10/24/2016
 */

public class CalendarMonthItem {
    private String name;
    private List<CalendarDayItem> items;

    public CalendarMonthItem() {
        items = new ArrayList<>();
    }

    public CalendarMonthItem(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CalendarDayItem> getItems() {
        return items;
    }

    public void setItems(List<CalendarDayItem> items) {
        this.items = items;
    }

    public void addItem(CalendarDayItem dayItem) {
        items.add(dayItem);
    }
}
