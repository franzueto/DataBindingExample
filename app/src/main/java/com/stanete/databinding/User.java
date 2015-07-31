package com.stanete.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by @stanete
 */
public class User extends BaseObservable {
    private String firstName;

    public User(String firstName) {
        this.firstName = firstName;
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(com.stanete.databinding.BR.firstName);
    }
}