package com.shakibcsekuet.jsonparsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class details extends AppCompatActivity {
    TextView title, time, details;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        title = (TextView) findViewById(R.id.title);
        time = (TextView) findViewById(R.id.time);
        details = (TextView) findViewById(R.id.details);


        String _title = getIntent().getStringExtra("MyTITLE");
        String _news = getIntent().getStringExtra("MyNEWS");
        String _time = getIntent().getStringExtra("MyTime");

        title.setText(_title);
        time.setText(_time+"\n\n");
        details.setText(_news);

    }
}
