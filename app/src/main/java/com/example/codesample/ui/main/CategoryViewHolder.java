package com.example.codesample.ui.main;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.codesample.R;
import com.example.codesample.model.Category;
import com.example.codesample.ui.base.BaseViewHolder;

import androidx.annotation.NonNull;
import butterknife.BindView;
import butterknife.ButterKnife;

public class CategoryViewHolder extends BaseViewHolder<Category> {
    @BindView(R.id.imageView)
    ImageView imageView;
    @BindView(R.id.textView)
    TextView textView;

    public CategoryViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(itemView);
    }

    @Override
    protected void bind(Category data) {
        setupAvatar(data.getUrl());
        setupTitle(data.getTitle());
    }

    private void setupTitle(String title) {
        textView.setText(title);
    }

    private void setupAvatar(String url) {
        Glide.with(itemView).load(url).into(imageView);
    }

    @Override
    protected void unbind() {
        Glide.with(itemView).clear(imageView);
    }
}