package com.awake.contacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.QuickContactBadge;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        QuickContactBadge quickContactBadge = (QuickContactBadge) findViewById(R.id.quickbadge);
        quickContactBadge.assignContactFromPhone("22258855", true);
    }
}
