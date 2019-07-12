package com.aoun.alc4phase1;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    /**
     * Initialize views
     */
    private void initView() {
        findViewById(R.id.activity_main_about).setOnClickListener(this);
        findViewById(R.id.activity_main_profile).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_main_about:
                //Start about activity
                Intent aboutIntent = new Intent(this, ActivityAbout.class);
                startActivity(aboutIntent);
                break;
            case R.id.activity_main_profile:
                //Start profile activity
                Intent profileActivity = new Intent(this, ActivityProfile.class);
                startActivity(profileActivity);
                break;
            default:
                Log.e(TAG, "Can't handle event");
        }
    }
}
