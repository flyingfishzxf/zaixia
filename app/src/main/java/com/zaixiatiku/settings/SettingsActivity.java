package com.zaixiatiku.settings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.zaixiatiku.R;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView title;
    private TextView subTitle;
    private Button feedBack;
    private Button about;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        title = findViewById(R.id.title);
        subTitle = findViewById(R.id.sub_title);
        feedBack = findViewById(R.id.feed_back);
        about = findViewById(R.id.about);

        title.setText("在下题库");
        subTitle.setText("设置");
        feedBack.setOnClickListener(this);
        about.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.feed_back:
                intent = new Intent(this, FeedBackActivity.class);
                startActivity(intent);
                break;
            case R.id.about:
                intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
