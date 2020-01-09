package com.example.viewpagerdemo;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import java.util.List;

public abstract class RVAdapter {

    private List<ResultType> resultTypes;


    public RVAdapter(List<ResultType> types) {
        this.resultTypes = types;
    }


    public ResultType getType(int position) {
        return resultTypes.get(position);
    }


    public int getCount() {
        return resultTypes == null ? 0 : resultTypes.size();
    }

    public abstract BaseQuickAdapter getRLAdapter(ServiceHorizontalView parent, ResultType type);


}
