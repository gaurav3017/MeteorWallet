package com.singh.grv.meteorwallet;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AppsFragment extends Fragment {

    GridView gridView;

    String[] values = {"meteorPlay","meteorBrowser","meteorChat","meteorViewer","meteorCalculator",
            "meteorCalendar","meteorManager","meteorTodo","meteorNotes","meteorClipboard","meteorCleaner"};

    int[] images = {R.drawable.meteor_play, R.drawable.meteor_browser, R.drawable.meteor_chat,
            R.drawable.meteor_viewer, R.drawable.meteor_calculator, R.drawable.meteor_calendar,
            R.drawable.meteor_manager, R.drawable.meteor_todo, R.drawable.meteor_notes,
            R.drawable.meteor_clip, R.drawable.meteor_cleaner};

    public AppsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_apps, container, false);

        gridView = (GridView) view.findViewById(R.id.grid_view_apps);
        GridViewAllAppsAdapter gridViewAllAppsAdapter = new GridViewAllAppsAdapter(getContext(), values, images);
        gridView.setAdapter(gridViewAllAppsAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getContext(), "Clicked on: " + values[position], Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
