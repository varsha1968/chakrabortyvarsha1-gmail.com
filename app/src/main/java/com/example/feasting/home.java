package com.example.feasting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            );
    getSupportActionBar().hide();
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    login=findViewById(R.id.btnlogin);
    login.setOnclickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
            Toast.makeText(home.this, "login is clicked", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(home.this,Signin_Activity.class);
            startActivity(intent);

        }

    }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}