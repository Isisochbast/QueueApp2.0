package com.example.henriiv.queueapp20;

//Klassen där en admin eller subuser kan skapa ett nytt event. Användaren fyller i följande info om eventet:
//-

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateEvent extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createevent);
        View v = findViewById(R.id.createNewEventButton);
        v.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        if(arg0.getId() == R.id.createNewEventButton){
            Intent intent = new Intent(this,AdminDashboard.class);

            this.startActivity(intent);
        }
    }
}
