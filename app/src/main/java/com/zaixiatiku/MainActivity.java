package com.zaixiatiku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button toLogin;
    private Button toRegister;
    private Button resetPassword;
    private Button toList;
    private Button toIndex;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toLogin = findViewById(R.id.to_login);
        toRegister = findViewById(R.id.to_register);
        resetPassword = findViewById(R.id.reset_password);
        toList = findViewById(R.id.to_list);
        toIndex = findViewById(R.id.to_index);

        toLogin.setOnClickListener(this);
        toRegister.setOnClickListener(this);
        resetPassword.setOnClickListener(this);
        toList.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.to_login:
                intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.to_register:
                intent = new Intent(this, RegisterActivity.class);
                startActivity(intent);
                break;
            case R.id.reset_password:
                intent = new Intent(this, ResetPasswordActivity.class);
                startActivity(intent);
                break;
            case R.id.to_list:
                intent = new Intent(this, PaperListActivity.class);
                startActivity(intent);
                break;
            case R.id.to_index:
                intent = new Intent(this, IndexActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
