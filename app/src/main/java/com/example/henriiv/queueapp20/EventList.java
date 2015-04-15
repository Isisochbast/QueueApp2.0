package com.example.henriiv.queueapp20;

//Klassen där en lista med events laddas för admins och subusers, där de kan gå vidare till EventView för
//specifika events.

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EventList extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventlist);
    }
}
