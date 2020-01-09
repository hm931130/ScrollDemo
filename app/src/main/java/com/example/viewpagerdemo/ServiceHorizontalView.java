package com.example.viewpagerdemo;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

import androidx.annotation.RequiresApi;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


public class ServiceHorizontalView extends HorizontalScrollView {


    private LinearLayout mContainer;

    private RVAdapter rvAdapter;

    private Map<ResultType, RecyclerView> typeRecyclerViewMap = new HashMap<>();
    private Map<ResultType, BaseQuickAdapter> typeRecyclerviewAdapterMap = new HashMap<>();

    public ServiceHorizontalView(Context context) {
        this(context, null);
    }

    public ServiceHorizontalView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ServiceHorizontalView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setRvAdapter(RVAdapter rvAdapter) {
        this.rvAdapter = rvAdapter;
        changeAdapter();
    }

    private void changeAdapter() {

        if (mContainer == null) {
            mContainer = (LinearLayout) getChildAt(0);
            mContainer.removeAllViews();
        }

        for (int i = 0; i < rvAdapter.getCount(); i++) {
            ResultType type = rvAdapter.getType(i);
            RecyclerView recyclerView = generateRLView();
            BaseQuickAdapter adapter = rvAdapter.getRLAdapter(this, type);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            recyclerView.setAdapter(adapter);
            typeRecyclerViewMap.put(type, recyclerView);
            typeRecyclerviewAdapterMap.put(type, adapter);

            mContainer.addView(recyclerView);
        }
    }

    //    public void initViews(List<ResultType> resultTypes) {
//        for (int i = 0; i < resultTypes.size(); i++) {
//            ResultType type = resultTypes.get(i);
//            RecyclerView recyclerView = generateRLView();
//            typeRecyclerViewMap.put(type, recyclerView);
//            RecyclerviewAdapter adapter = new RecyclerviewAdapter(getContext());
//            typeRecyclerviewAdapterMap.put(type, adapter);
//            recyclerView.setAdapter(adapter);
//
//        }
//    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setFillViewport(true);
        mContainer = (LinearLayout) getChildAt(0);
        mContainer.setOrientation(LinearLayout.HORIZONTAL);
    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private RecyclerView generateRLView() {
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(650,
                ViewGroup.LayoutParams.MATCH_PARENT));
        recyclerView.setBackground(new ColorDrawable(Color.parseColor("#000000")));

        return recyclerView;


    }
}
