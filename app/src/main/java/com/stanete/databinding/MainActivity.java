package com.stanete.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.stanete.databinding.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User("Freddy");
        binding.setUser(user);
    }

    public void changeData(View view) {
        user.setFirstName("Christian");
    }
}
