package com.example.henriiv.queueapp20;

//Klass som är en lista av alla subusers som är länkade till adminen.

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SubuserList extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subuserlist);
    }
}
