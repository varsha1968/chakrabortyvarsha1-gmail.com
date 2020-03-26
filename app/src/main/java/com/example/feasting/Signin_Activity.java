package com.example.feasting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Signin_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_);
        getSupportActionBar().setTitle("Sign in");
        getSupportActionBar().setDisplayShowCustomEnabled(true);

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
}
