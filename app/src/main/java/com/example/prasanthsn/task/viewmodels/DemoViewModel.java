package com.example.prasanthsn.task.viewmodels;

import android.content.Context;
import android.databinding.BaseObservable;
import android.view.View;
import android.widget.Toast;

public class DemoViewModel extends BaseObservable {

    private Context context;

    public DemoViewModel(Context context) {
        this.context = context;
    }

    public ObservableString name = new ObservableString();
    public ObservableString text = new ObservableString();

    public void onHandleClick(View view) {
        Toast.makeText(context, "HandledClick", Toast.LENGTH_SHORT).show();
    }

}
