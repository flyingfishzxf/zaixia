package com.zaixiatiku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PaperListActivity extends AppCompatActivity {

    private List<Paper> paperList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper_list);

        initPapers();

        RecyclerView recyclerView = findViewById(R.id.rv_paper_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        PaperAdapter adapter = new PaperAdapter(paperList);
        recyclerView.setAdapter(adapter);
    }

    private void initPapers() {
        Paper p1 = new Paper("国家司法考试", "卷一");
        paperList.add(p1);
        Paper p2 = new Paper("国家司法考试", "卷二");
        paperList.add(p2);
        Paper p3 = new Paper("国家司法考试", "卷三");
        paperList.add(p3);
    }
}
