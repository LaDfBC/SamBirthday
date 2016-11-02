package george.mausshardt.com.sambirthday.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by George on 11/1/2016.
 */

public enum Month {
    JANUARY(3, "January"),
    FEBRUARY(4, "February"),
    MARCH(5, "March"),
    APRIL(6, "April"),
    MAY(7, "May"),
    JUNE(8, "June"),
    JULY(9, "July"),
    AUGUST(10, "August"),
    SEPTEMBER(11, "September"),
    OCTOBER(12, "October"),
    NOVEMBER(13, "November"),
    DECEMBER(2, "December");

    private Integer order;
    private String displayName;

    Month(Integer order, String displayName) {
        this.order = order;
        this.displayName = displayName;
    }

    public List<Month> getPreviousMonths() {
        List<Month> previousMonths = new ArrayList<>();

        for(Month monthToCompare : Month.values()) {
            if(monthToCompare.order < order) {
                previousMonths.add(monthToCompare);
            }
        }

        return previousMonths;
    }

    public String getDisplayName() {
        return displayName;
    }

}
