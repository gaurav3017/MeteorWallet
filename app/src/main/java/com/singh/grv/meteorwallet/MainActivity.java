package com.singh.grv.meteorwallet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar_main);
        this.setSupportActionBar(toolbar);
        this.getSupportActionBar().setDisplayShowTitleEnabled(false);

        RecyclerView recyclerViewTimelineSmall = (RecyclerView)findViewById(R.id.timeline_small);
        recyclerViewTimelineSmall.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewTimelineSmall.setAdapter(new TimelineSmallAdapter());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //MenuInflater menuInflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int res_id = item.getItemId();

        if(res_id==R.id.menu_settings)
        {
            Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
