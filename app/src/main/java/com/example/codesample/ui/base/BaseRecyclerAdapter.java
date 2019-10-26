package com.example.codesample.ui.base;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public abstract class BaseRecyclerAdapter<V extends BaseViewHolder, T> extends RecyclerView.Adapter<V> {
    private List<T> data = new ArrayList<>();

    @NonNull
    @Override
    public V onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(getLayoutRes(), parent, false);
        return getViewHolder(view);
    }

    @LayoutRes
    protected abstract int getLayoutRes();

    protected abstract V getViewHolder(View view);

    @Override
    public void onBindViewHolder(@NonNull V holder, int position) {
        holder.bind(getItem(position));
    }

    @Override
    public void onViewRecycled(@NonNull V holder) {
        super.onViewRecycled(holder);
        holder.unbind();
    }

    protected T getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void update(List<T> list){
        this.data = list;
        notifyDataSetChanged();
    }
}
