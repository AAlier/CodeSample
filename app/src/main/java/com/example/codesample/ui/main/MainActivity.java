package com.example.codesample.ui.main;

import android.os.Bundle;

import com.example.codesample.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.categoryRecyclerView)
    RecyclerView recyclerView;

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setupPresenter();
        setupRecyclerView();
    }

    private void setupPresenter() {
        presenter = new MainPresenter();
    }

    private void setupRecyclerView() {
        CategoryAdapter adapter = new CategoryAdapter();
        adapter.update(presenter.getGeneratedData());
        recyclerView.setAdapter(adapter);
    }
}
