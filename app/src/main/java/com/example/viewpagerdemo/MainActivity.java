package com.example.viewpagerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.HorizontalScrollView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private HorizontalScrollView scrollView;


    private RecyclerView recyclerView1;
    private RecyclerView recyclerView2;
    private RecyclerView recyclerView3;

    private List<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ServiceHorizontalView serviceHorizontalView = findViewById(R.id.scrollView);
        List<ResultType> typeList = new ArrayList<>();
        typeList.add(ResultType.TYPE_SERVICE);
        typeList.add(ResultType.TYPE_SERVICE);
        typeList.add(ResultType.TYPE_SERVICE);

        RVTestAdapter adapter = new RVTestAdapter(typeList);
        serviceHorizontalView.setRvAdapter(adapter);

//        scrollView = findViewById(R.id.scrollView);
//
//        for (int i = 0; i < 50; i++) {
//            data.add("item" + i);
//        }
//
//        recyclerView1 = findViewById(R.id.recyclerView1);
//        recyclerView2 = findViewById(R.id.recyclerView2);
//        recyclerView3 = findViewById(R.id.recyclerView3);
//
//
//        RecyclerviewAdapter adapter = new RecyclerviewAdapter(this, data);
//        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView1.setAdapter(adapter);
//
//        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView2.setAdapter(adapter);
//
//        recyclerView3.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView3.setAdapter(adapter);

    }
}
