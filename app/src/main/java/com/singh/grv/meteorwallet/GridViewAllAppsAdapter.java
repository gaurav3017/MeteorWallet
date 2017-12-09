package com.singh.grv.meteorwallet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by grv on 08-12-2017.
 */

public class GridViewAllAppsAdapter extends BaseAdapter {

    Context context;
    private final String[] values;//https://www.youtube.com/watch?v=TLDEl5tudP0  --Tutorial for gridview
    private final int [] images;

    LayoutInflater layoutInflater;

    public GridViewAllAppsAdapter(Context context, String[] values, int[] images) {
        this.context = context;
        this.values = values;
        this.images = images;
    }

    @Override
    public int getCount() {
        return values.length;
    }

    @Override
    public Object getItem(int position) {
        return values[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        View view = convertView;



        if(convertView == null)
        {
            //view = new View(context);
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.gridview_single_item, null);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.icon_imageView);
        TextView textView = (TextView) view.findViewById(R.id.title_textView);
        imageView.setImageResource(images[position]);
        textView.setText(values[position]);
        return view;
    }
}
