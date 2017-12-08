package com.singh.grv.meteorwallet;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TransactionFragment extends Fragment {


    public TransactionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_transaction, container, false);

        RecyclerView recyclerViewTimelineSmall = (RecyclerView)view.findViewById(R.id.timeline_small);
        recyclerViewTimelineSmall.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewTimelineSmall.setAdapter(new TimelineSmallAdapter());

        return view;
    }

}
