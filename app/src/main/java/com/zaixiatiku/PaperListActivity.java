package com.zaixiatiku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.zaixiatiku.settings.SettingsActivity;

import java.util.ArrayList;
import java.util.List;

public class PaperListActivity extends AppCompatActivity implements View.OnClickListener {

    private List<Paper> paperList = new ArrayList<>();

    private Intent intent;

    private Button settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper_list);

        initPapers();

        RecyclerView recyclerView = findViewById(R.id.rv_paper_list);
        settings = findViewById(R.id.settings);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        PaperAdapter adapter = new PaperAdapter(paperList);
        recyclerView.setAdapter(adapter);

        // 设置按钮事件
        settings.setOnClickListener(this);
    }

    private void initPapers() {
        Paper p1 = new Paper("国家司法考试", "卷一");
        paperList.add(p1);
        Paper p2 = new Paper("国家司法考试", "卷二");
        paperList.add(p2);
        Paper p3 = new Paper("国家司法考试", "卷三");
        paperList.add(p3);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.settings:
                intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
