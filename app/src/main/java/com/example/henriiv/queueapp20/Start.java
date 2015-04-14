package com.example.henriiv.queueapp20;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.parse.Parse;
import com.parse.ParseObject;


public class Start extends ActionBarActivity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "KfmvmB1sCQ69kQ7Btfge88VkHPbkeGDMwALyp17p", "BAvqz1Tbs1npbKQkQ24pRNghYGOMBRRdytlIhHzF");

        setContentView(R.layout.activity_start);

        View x = findViewById(R.id.adminButton);
        x.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        if(arg0.getId() == R.id.adminButton){
            Intent intent = new Intent(this,AdminLogin.class);

            this.startActivity(intent);
        }
    }
}