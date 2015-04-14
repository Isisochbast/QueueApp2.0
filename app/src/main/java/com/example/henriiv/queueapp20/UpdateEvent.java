package com.example.henriiv.queueapp20;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UpdateEvent extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updateevent);
        View v = findViewById(R.id.updateEventButton);
        v.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        if(arg0.getId() == R.id.updateEventButton){
            Intent intent = new Intent(this,AdminDashboard.class);

            this.startActivity(intent);
        }
    }
}
