package com.example.viewpagerdemo;

import androidx.recyclerview.widget.RecyclerView;

public class RLTypeHolder {

    private ResultType type;
    private RecyclerView recyclerView;

    public RLTypeHolder(ResultType type, RecyclerView recyclerView) {
        this.type = type;
        this.recyclerView = recyclerView;
    }

    public ResultType getType() {
        return type;
    }

    public void setType(ResultType type) {
        this.type = type;
    }

    public RecyclerView getRecyclerView() {
        return recyclerView;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }
}
