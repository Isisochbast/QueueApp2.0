package com.example.henriiv.queueapp20;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class AdminLogin extends Activity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminlogin);
        View v = findViewById(R.id.loginButton);
        v.setOnClickListener(this);
        View w = findViewById(R.id.forgottenPasswordButton);
        w.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        if(arg0.getId() == R.id.loginButton){
            Intent intent = new Intent(this,AdminDashboard.class);

            this.startActivity(intent);
        }
        if(arg0.getId() == R.id.forgottenPasswordButton){
            Intent intent = new Intent(this,ForgottenPassword.class);

            this.startActivity(intent);
        }
    }
}
