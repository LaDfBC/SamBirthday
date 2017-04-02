package george.mausshardt.com.sambirthday.dataStructures;

/**
 * Created by George on 10/24/2016.
 */

public class CalendarDayItem {
    private String name;
    private String tag;

    public CalendarDayItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public String getTag() { return tag; }

    public void setTag(String tag) { this.tag = tag; }
}
