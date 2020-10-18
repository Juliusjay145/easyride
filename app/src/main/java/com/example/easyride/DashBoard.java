package com.example.easyride;

import android.os.Bundle;
import android.os.StrictMode;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class DashBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_dashboard);

//        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().build();
//        StrictMode.setThreadPolicy(policy);
//
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.hide();
//
//        pref = getSharedPreferences("user_details", MODE_PRIVATE);
//        user = findViewById(R.id.editText3);
//        pass = findViewById(R.id.editText4);
//        btnLogin = findViewById(R.id.button);
//        txtregister =  findViewById(R.id.register);
//        btnLogin.setOnClickListener(this);
//        txtregister.setOnClickListener(this);
    }
}
