package com.example.prasanthsn.task.adapter;

import android.annotation.SuppressLint;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.android.databinding.library.baseAdapters.BR;

public abstract class BaseBaseAdapter extends BaseAdapter {

    @Override
    public Object getItem(int i) {
        return getDataAtPosition(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, getLayoutIdForPosition(position), viewGroup, false);
        binding.setVariable(BR.obj, getDataAtPosition(position));
        binding.executePendingBindings();
        return binding.getRoot();
    }

    public abstract Object getDataAtPosition(int position);

    public abstract int getLayoutIdForPosition(int viewType);
}
