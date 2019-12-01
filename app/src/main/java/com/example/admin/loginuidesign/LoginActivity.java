package com.example.admin.loginuidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void moveToRegistration(View view)
    {
        Intent intent=new Intent(this, Sighup_class.class);
        startActivity(intent);
    }

    public void Login(View view)
    {
        Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();
    }
}
