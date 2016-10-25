package george.mausshardt.com.sambirthday.dataStructures;

import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by George on 10/24/2016.
 */

/**
 * Two types of items we need: A header, and a list item
 */
public interface ListItem {
    public int getViewType();
    public View getView(LayoutInflater inflater, View convertView);
}
