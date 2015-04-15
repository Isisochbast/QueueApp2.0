package com.example.henriiv.queueapp20;

//Klassen där en admin eller subuser kan skapa ett nytt event. Användaren fyller i följande info om eventet:
//- vilken typ av event det är: lunch, pub, klubb
//- om klubb: vad det är för inträde
//- när eventet börjar och slutar (tid och datum)
//- om eventet ska upprepas, och isf hur ofta
//- ett eventnamn
//- eventinfo

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.parse.ParseObject;

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

            //TANKA IN INFO FR RADIOBUTTON
            //TANKA COVER CHARGE OM KLUBB
            EditText start = (EditText) findViewById(R.id.inputStart);
            String s = start.getText().toString();
            EditText end = (EditText) findViewById(R.id.inputEnd);
            String e = end.getText().toString();
            //TANKA UPPREPA
            //OM JA, TANKA NÄR
            EditText name = (EditText) findViewById(R.id.inputEventName);
            String n = name.getText().toString();
            EditText info = (EditText) findViewById(R.id.inputEventInfo);
            String i = info.getText().toString();
            //LÄGG IN USERS SOM SKA BERÖRAS!!!

            ParseObject user = new ParseObject("Event");
            user.put("start", s);
            user.put("end", e);
            user.put("name", n);
            user.put("info", i);
            user.saveInBackground();

            //OM SUCCESSFUL GE BEKRÄFTELSE PÅ SKAPAT EVENT
            Intent intent = new Intent(this,AdminDashboard.class);

            this.startActivity(intent);
        }
    }
}
