package george.mausshardt.com.sambirthday.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by George on 11/1/2016.
 */

public enum Month {
    NOVEMBER(1, "November"),
    DECEMBER(2, "December");

    private Integer order;

    Month(Integer order, String displayName) {
        this.order = order;
    }

    public List<Month> getPreviousMonths(Month month) {
        List<Month> previousMonths = new ArrayList<>();

        for(Month monthToCompare : Month.values()) {
            if(monthToCompare.order < month.order) {
                previousMonths.add(monthToCompare);
            }
        }

        return previousMonths;
    }

}
