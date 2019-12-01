package com.example.admin.loginuidesign;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Sighup_class extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void moveToLogin(View v)
    {
        Intent intent=new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    
    public  void Register(View view)
    {
        Toast.makeText(this, "Registration", Toast.LENGTH_SHORT).show();
    }
}
