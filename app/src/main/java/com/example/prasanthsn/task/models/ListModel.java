package com.example.prasanthsn.task.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class ListModel extends BaseObservable {

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
