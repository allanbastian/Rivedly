package com.edunomics.multithread;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ContentActivity extends AppCompatActivity {

    private RecyclerView PostRecycler;
    private OuterRecyclerAdapter Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        PostRecycler = findViewById(R.id.outer_recycler);
    }
}
