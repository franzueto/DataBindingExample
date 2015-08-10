package com.stanete.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.stanete.databinding.databinding.ActivityMainBinding;

import org.apache.commons.lang3.StringUtils;


public class MainActivity extends AppCompatActivity {

    User user;
    Handlers handlers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User();
        handlers = new Handlers(user, this);

        binding.setUser(user);
        binding.setHandlers(handlers);

    }
}
