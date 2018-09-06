package com.example.prasanthsn.task;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.example.prasanthsn.task.adapter.DemoAdapter;
import com.example.prasanthsn.task.adapter.DemoListAdapter;
import com.example.prasanthsn.task.databinding.ActivityMainBinding;
import com.example.prasanthsn.task.viewmodels.DemoViewModel;
import com.example.prasanthsn.task.viewmodels.ListViewModel;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(new DemoViewModel(this));


        recyclerView =  findViewById(R.id.my_recycler_view);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<ListViewModel> items =
                Arrays.asList(new ListViewModel("Hamburg", "5"), new ListViewModel("Berlin", "6"));

        // define an adapter
        mAdapter = new DemoAdapter(items);
        recyclerView.setAdapter(mAdapter);

        ListView listView = findViewById(R.id.my_list_view);
        listView.setAdapter(new DemoListAdapter(items));

    }
}
