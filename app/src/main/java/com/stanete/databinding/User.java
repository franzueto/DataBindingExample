package com.stanete.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

/**
 * Created by @stanete
 */
public class User extends BaseObservable {

    private String firstName;
    private String lastName;
    private boolean loggedIn;
    private boolean friend;

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
        notifyPropertyChanged(com.stanete.databinding.BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(com.stanete.databinding.BR.lastName);
    }

    @Bindable
    public boolean isFriend() {
        return friend;
    }

    public void setFriend(boolean friend) {
        this.friend = friend;
        notifyPropertyChanged(com.stanete.databinding.BR.friend);
    }

    @Bindable
    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
        notifyPropertyChanged(com.stanete.databinding.BR.loggedIn);
    }

    public void changeData(View view) {

        setFirstName("David");

    }
}