package com.example.henriiv.queueapp20;

//Klass som visar info om en specifik subuser. Subusern kan även raderas.

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SubuserView extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subuserview);
    }
}
