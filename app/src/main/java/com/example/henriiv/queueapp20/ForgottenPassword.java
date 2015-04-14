package com.example.henriiv.queueapp20;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgottenPassword extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgottenpassword);
        View v = findViewById(R.id.sendPasswordButton);
        v.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        if(arg0.getId() == R.id.sendPasswordButton){
            Intent intent = new Intent(this,AdminLogin.class);

            this.startActivity(intent);
        }
    }
}
