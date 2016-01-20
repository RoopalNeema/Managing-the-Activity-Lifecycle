package com.roopal.leftshift.lifecycle_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.roopal.leftshift.lifecycle_activity.R.layout;
import android.R;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SecondActivity extends TracerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_second);

        Spinner spinner;
        spinner = (Spinner) findViewById(com.roopal.leftshift.lifecycle_activity.R.id.spinner);
        String[] values = getResources().getStringArray(com.roopal.leftshift.lifecycle_activity.R.array.operating_systems);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        spinner.setAdapter(adapter);
    }


}
