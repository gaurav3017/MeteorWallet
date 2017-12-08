package com.singh.grv.meteorwallet;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.vipulasri.timelineview.TimelineView;

/**
 * Created by grv on 07-12-2017.
 */

public class TimelineSmallAdapter extends RecyclerView.Adapter<TimelineSmallAdapter.TimelineSmallViewHolder> {

    private String[] dataName = {"CREDIT RECEIVED", "CREDIT RECEIVED", "CREDIT RECEIVED",
            "CREDIT RECEIVED", "CREDIT RECEIVED", "CREDIT RECEIVED", "CREDIT RECEIVED", "CREDIT RECEIVED",
            "CREDIT RECEIVED", "CREDIT RECEIVED"};
    /*public com.singh.grv.meteorwallet.TimelineSmallAdapter(String[] dataName)
    {
        this.dataName=dataName;
    }*/

    @Override
    public TimelineSmallViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.timeline_list_item, parent, false);
        return new TimelineSmallViewHolder(view, viewType);
    }

    @Override
    public int getItemViewType(int position) {
        return TimelineView.getTimeLineViewType(position,getItemCount());
    }

    @Override
    public void onBindViewHolder(TimelineSmallViewHolder holder, int position) {
        String name = dataName[position];
        holder.nameTimeline.setText(name);

    }

    @Override
    public int getItemCount() {
        return dataName.length;
    }

    public class TimelineSmallViewHolder extends RecyclerView.ViewHolder{

        ImageView iconTimeline;
        TextView dateTimeline, nameTimeline, nameSubtitleTimeline, amountTimeline;
        public TimelineView mTimelineView;

        public TimelineSmallViewHolder(View itemView, int viewType) {
            super(itemView);

            mTimelineView = (TimelineView) itemView.findViewById(R.id.timeline_small_marker);
            mTimelineView.initLine(viewType);

            iconTimeline = (ImageView) itemView.findViewById(R.id.icon_timeline);
            dateTimeline = (TextView) itemView.findViewById(R.id.date_timeline);
            nameTimeline = (TextView) itemView.findViewById(R.id.name_timeline);
            nameSubtitleTimeline = (TextView) itemView.findViewById(R.id.name_subtitle_timeline);
            amountTimeline = (TextView) itemView.findViewById(R.id.amount_timeline);
        }
    }
}
