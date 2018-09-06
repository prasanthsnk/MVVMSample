package com.example.prasanthsn.task.adapter;
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

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
//        LayoutInflater inflater = (LayoutInflater)
//                viewGroup.getContext()
//                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        ViewDataBinding  binding = DataBindingUtil.inflate(inflater, getLayoutIdForPosition(position), viewGroup, true);
//        binding.setVariable(BR.obj, getDataAtPosition(position));
//        binding.executePendingBindings();
//        return binding.getRoot();
//        //////////////
        ViewDataBinding binding;
        if(view == null){
            view = LayoutInflater.from(viewGroup.getContext()).inflate(getLayoutIdForPosition(position), null);
            binding = DataBindingUtil.bind(view);
            view.setTag(binding);
        }else{
            binding = (ViewDataBinding) view.getTag();
        }
        assert binding != null;
        binding.setVariable(BR.obj, getDataAtPosition(position));
        return binding.getRoot();
    }

    public abstract Object getDataAtPosition(int position);

    public abstract int getLayoutIdForPosition(int viewType);
}
