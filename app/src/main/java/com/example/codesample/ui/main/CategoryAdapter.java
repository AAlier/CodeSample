package com.example.codesample.ui.main;

import android.view.View;

import com.example.codesample.R;
import com.example.codesample.model.Category;
import com.example.codesample.ui.base.BaseRecyclerAdapter;

public class CategoryAdapter extends BaseRecyclerAdapter<CategoryViewHolder, Category> {
    @Override
    protected int getLayoutRes() {
        return R.layout.item_category;
    }

    @Override
    protected CategoryViewHolder getViewHolder(View view) {
        return new CategoryViewHolder(view);
    }
}
