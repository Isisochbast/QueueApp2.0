package com.example.henriiv.queueapp20;

//Klassen där info om ett specifikt event visas. Eventet kan även raderas.

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EventView extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventview);
    }
}
