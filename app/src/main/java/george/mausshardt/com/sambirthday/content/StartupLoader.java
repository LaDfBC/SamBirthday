package george.mausshardt.com.sambirthday.content;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import george.mausshardt.com.sambirthday.dataStructures.CalendarTimelineItem;

/**
 * Created by George on 10/29/2016
 */

public class StartupLoader extends AppCompatActivity {
    private static Calendar calendar;

    StartupLoader() {}

    public static Calendar getCurrentDate() {
        return Calendar.getInstance();
    }
}
