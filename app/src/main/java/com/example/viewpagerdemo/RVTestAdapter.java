package com.example.viewpagerdemo;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import java.util.Arrays;
import java.util.List;

public class RVTestAdapter extends RVAdapter {
    public RVTestAdapter(List<ResultType> types) {
        super(types);
    }

    @Override
    public BaseQuickAdapter getRLAdapter(ServiceHorizontalView parent, ResultType type) {

        BaseQuickAdapter adapter = new BaseQuickAdapter<String, BaseViewHolder>(R.layout.item_recyclerview,
                Arrays.asList(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"})) {
            @Override
            protected void convert(BaseViewHolder baseViewHolder, String s) {
                baseViewHolder.setText(R.id.name, s);
            }
        };
        return adapter;
    }
}
