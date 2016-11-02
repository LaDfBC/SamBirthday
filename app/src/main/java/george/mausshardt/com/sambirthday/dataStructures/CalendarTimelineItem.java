package george.mausshardt.com.sambirthday.dataStructures;

import java.util.List;

/**
 * Created by George on 10/29/2016
 */

public class CalendarTimelineItem {
    private String name;
    private List<CalendarMonthItem> items;

    public CalendarTimelineItem() {

    }

    public CalendarTimelineItem(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    List<CalendarMonthItem> getItems() {
        return items;
    }

    public void setItems(List<CalendarMonthItem> items) {
        this.items = items;
    }

    public void addItem(CalendarMonthItem item) {
        items.add(item);
    }
}
