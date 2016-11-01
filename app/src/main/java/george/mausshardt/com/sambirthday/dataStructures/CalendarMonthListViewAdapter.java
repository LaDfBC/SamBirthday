package george.mausshardt.com.sambirthday.dataStructures;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import george.mausshardt.com.sambirthday.R;

/**
 * Created by George on 10/24/2016
 */

public class CalendarMonthListViewAdapter extends BaseExpandableListAdapter {
    private Context context;
    private ArrayList<CalendarMonthItem> groups;

    public CalendarMonthListViewAdapter(Context context, ArrayList<CalendarMonthItem> groups) {
        this.context = context;
        this.groups = groups;
    }

    public void addItem(CalendarDayItem item, CalendarMonthItem group) {
        if (!groups.contains(group)) {
            groups.add(group);
        }

        int index = groups.indexOf(group);
        ArrayList<CalendarDayItem> currentGroup = groups.get(index).getItems();
        currentGroup.add(item);
        groups.get(index).setItems(currentGroup);
    }

    @Override
    public int getGroupCount() {
        return groups.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return groups.get(groupPosition).getItems().size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return groups.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return groups.get(groupPosition).getItems().get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true; //Always
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        CalendarMonthItem group = (CalendarMonthItem) getGroup(groupPosition);
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.calendar_group_item, null);
        }

        TextView textView = (TextView) convertView.findViewById(R.id.text_view_group);
        textView.setText(group.getName());

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild,
                             View convertView, ViewGroup parent) {
        CalendarDayItem child = (CalendarDayItem) getChild(groupPosition, childPosition);

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.calendar_child_item, null);
        }
        TextView textView = (TextView) convertView.findViewById(R.id.text_view_child);
        textView.setText(child.getName());
        textView.setTag(child.getTag());
        return textView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true; //Always
    }
}
