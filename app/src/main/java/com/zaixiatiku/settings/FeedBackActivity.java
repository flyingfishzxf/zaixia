package com.zaixiatiku.settings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.zaixiatiku.R;

public class FeedBackActivity extends AppCompatActivity {

    private TextView title;
    private TextView subTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);

        title = findViewById(R.id.title);
        subTitle = findViewById(R.id.sub_title);

        title.setText("在下题库");
        subTitle.setText("反馈意见");
    }
}
