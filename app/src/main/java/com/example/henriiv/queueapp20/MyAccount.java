package com.example.henriiv.queueapp20;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MyAccount extends Activity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myaccount);

        View v = findViewById(R.id.newPasswordButton);
        v.setOnClickListener(this);
    }

    public void onClick(View arg0) {
        if(arg0.getId() == R.id.newPasswordButton){
            Intent intent = new Intent(this,AdminDashboard.class);

            this.startActivity(intent);
        }
    }
}
