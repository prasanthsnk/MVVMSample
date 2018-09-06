package com.example.prasanthsn.task.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

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
}
