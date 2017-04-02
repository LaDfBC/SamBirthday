package george.mausshardt.com.sambirthday.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by George on 11/1/2016
 */

public enum Month {
    JANUARY(3, "January", 0),
    FEBRUARY(4, "February", 1),
    MARCH(5, "March", 2),
    APRIL(6, "April", 3),
    MAY(7, "May", 4),
    JUNE(8, "June", 5),
    JULY(9, "July", 6),
    AUGUST(10, "August", 7),
    SEPTEMBER(11, "September", 8),
    OCTOBER(12, "October", 9),
    NOVEMBER(1, "November", 10),
    DECEMBER(2, "December", 11);

    private Integer fromBirthdayOrder;
    private String displayName;
    private Integer trueOrder;

    private static Comparator<Month> birthdaySorter = new Comparator<Month>() {
        @Override
        public int compare(Month month, Month month2) {
            if(month.fromBirthdayOrder < month2.fromBirthdayOrder) {
                return -1;
            } else if (month.fromBirthdayOrder > month2.fromBirthdayOrder) {
                return 1;
            }

            return 0;
        }
    };

    Month(Integer fromBirthdayOrder, String displayName, Integer trueOrder) {
        this.fromBirthdayOrder = fromBirthdayOrder;
        this.displayName = displayName;
        this.trueOrder = trueOrder;
    }

    public static List<Month> getPreviousMonths(Month month) {
        List<Month> previousMonths = new ArrayList<>();

        for(Month monthToCompare : Month.values()) {
            if(monthToCompare.fromBirthdayOrder < month.fromBirthdayOrder) {
                previousMonths.add(monthToCompare);
            }
        }

        Collections.sort(previousMonths, birthdaySorter);

        return previousMonths;
    }

    public static List<Month> getFutureMonths(Month month) {
        List<Month> futureMonths = new ArrayList<>();

        for(Month monthToCompare : Month.values()) {
            if(monthToCompare.fromBirthdayOrder > month.fromBirthdayOrder) {
                futureMonths.add(monthToCompare);
            }
        }

        Collections.sort(futureMonths, birthdaySorter);

        return futureMonths;
    }

    public static Month fromMonthInteger(int monthInteger) {
        for (Month currentMonth : Month.values()) {
            if (currentMonth.trueOrder.equals(monthInteger)) {
                return currentMonth;
            }
        }

        throw new IllegalArgumentException("Month Integer too big - we only have 12 of these!");
    }

    public String getDisplayName() {
        return displayName;
    }
}
