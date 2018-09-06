package com.example.prasanthsn.task.adapter;

import com.example.prasanthsn.task.R;
import com.example.prasanthsn.task.viewmodels.ListViewModel;

import java.util.List;

public class DemoAdapter extends BaseAdapter {

    List<ListViewModel> data;

    // Provide a suitable constructor (depends on the kind of dataset)
    public DemoAdapter(List<ListViewModel> myDataset) {
        data = myDataset;
    }
    @Override
    public Object getDataAtPosition(int position) {
        return data.get(position);
    }

    @Override
    public int getLayoutIdForType(int viewType) {
        return R.layout.layout_list;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}