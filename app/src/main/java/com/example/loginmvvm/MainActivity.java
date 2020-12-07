package com.example.loginmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.loginmvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        LoginViewModel loginViewModel = new LoginViewModel();
        mainBinding.setLoginViewodel(loginViewModel);
    }
}