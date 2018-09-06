package com.example.prasanthsn.task.adapter;

import com.example.prasanthsn.task.R;
import com.example.prasanthsn.task.viewmodels.ListViewModel;

import java.util.List;

public class DemoListAdapter extends BaseBaseAdapter {
    private List<ListViewModel> data;

    public DemoListAdapter(List<ListViewModel> data) {
        this.data = data;
    }

    @Override
    public Object getDataAtPosition(int position) {
        return data.get(position);
    }

    @Override
    public int getLayoutIdForPosition(int viewType) {
        return R.layout.layout_list;
    }

    @Override
    public int getCount() {
        return data.size();
    }
}
