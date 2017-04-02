package george.mausshardt.com.sambirthday.dataStructures;

import java.util.ArrayList;
import java.util.List;

import george.mausshardt.com.sambirthday.enums.Month;

/**
 * Created by George on 10/29/2016
 */

public class CalendarTimelineItem {
    private String name;
    private ArrayList<CalendarMonthItem> items;

    public CalendarTimelineItem(String name) {
        this.name = name;
        items = new ArrayList<>();
    }

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

    public void setItemsAsMonths(List<Month> itemsAsMonths) {
        items.clear();
        for(Month currentMonth : itemsAsMonths) {
            items.add(new CalendarMonthItem(currentMonth.getDisplayName()));
        }
    }

    public void setItemAsSingletonMonth(Month singleMonth) {
        items.clear();
        items.add(new CalendarMonthItem(singleMonth.getDisplayName()));
    }
}
