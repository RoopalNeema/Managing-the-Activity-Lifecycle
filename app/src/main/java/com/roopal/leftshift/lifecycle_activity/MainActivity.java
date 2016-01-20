package com.roopal.leftshift.lifecycle_activity;

import android.content.Intent;
import com.roopal.leftshift.lifecycle_activity.R.layout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends TracerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
    }

    public void onClick(View view)
    {
        Intent intent=new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
