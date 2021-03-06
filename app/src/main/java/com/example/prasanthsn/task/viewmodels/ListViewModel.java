package com.example.prasanthsn.task.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class ListViewModel extends BaseObservable {

    public ListViewModel(String name, String age) {
        this.name = name;
        this.age = age;
    }
    private String name;
    private String age;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bindable
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void onHandleClick(String name) {
        Log.e("TAG", name);
    }
}
