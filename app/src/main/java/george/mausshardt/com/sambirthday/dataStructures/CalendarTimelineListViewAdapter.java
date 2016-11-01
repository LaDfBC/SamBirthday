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
 * Created by George on 10/29/2016.
 */

public class CalendarTimelineListViewAdapter extends BaseExpandableListAdapter {
    private Context context;
    private ArrayList<CalendarTimelineItem> sections;

    public CalendarTimelineListViewAdapter(Context context, ArrayList<CalendarTimelineItem> sections) {
        this.context = context;
        this.sections = sections;
    }

    @Override
    public int getGroupCount() {
        return sections.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return sections.get(groupPosition).getItems().size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return sections.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return sections.get(groupPosition).getItems().get(childPosition);
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
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        CalendarTimelineItem section = (CalendarTimelineItem) getGroup(groupPosition);
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.calendar_timeline_item, null);
        }

        TextView textView = (TextView) convertView.findViewById(R.id.text_view_timeline);
        textView.setText(section.getName());

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        CalendarMonthItem child = (CalendarMonthItem) getChild(groupPosition, childPosition);

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.calendar_group_item, null);
        }

        TextView textView = (TextView) convertView.findViewById(R.id.text_view_group);
        textView.setText(child.getName());

        return textView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
