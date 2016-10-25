package george.mausshardt.com.sambirthday.dataStructures;

import java.util.ArrayList;

/**
 * Created by George on 10/24/2016
 */

public class CalendarGroupItem {
    private String name;
    private ArrayList<CalendarListItem> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<CalendarListItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<CalendarListItem> items) {
        this.items = items;
    }
}
