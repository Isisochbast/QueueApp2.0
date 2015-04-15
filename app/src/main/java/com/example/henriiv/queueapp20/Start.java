package com.example.henriiv.queueapp20;

//Klass där användare välja att se vilka klubbar och pubar som händer idag,
//och admins och subusers kan välja att logga in.

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.parse.Parse;


public class Start extends ActionBarActivity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "wj5TLSCSPyL9Zu2gRoNNytLUtUnhal4MPwxI3Xvo", "Aq8kFYQnfo6mYv77lPATH4f2SXkFjmiNnbtQRG3F");

        setContentView(R.layout.activity_start);

        View x = findViewById(R.id.adminButton);
        x.setOnClickListener(this);

        View y = findViewById(R.id.knappKlubb);
        y.setOnClickListener(this);

        View z =findViewById(R.id.knappPub);
        z.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        //till adminsidan
        if(arg0.getId() == R.id.adminButton){
            Intent intent = new Intent(this,AdminLogin.class);

            this.startActivity(intent);
        }
        //til klubbsidan
        if(arg0.getId() == R.id.knappKlubb){
            Intent intent = new Intent(this,Klubb.class);

            this.startActivity(intent);
        }
        //till pubsida
        if(arg0.getId() == R.id.knappPub){
            Intent intent = new Intent(this,Pub.class);

            this.startActivity(intent);
        }
    }
}