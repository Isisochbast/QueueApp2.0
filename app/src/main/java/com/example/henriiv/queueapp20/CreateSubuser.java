package com.example.henriiv.queueapp20;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.parse.ParseObject;

public class CreateSubuser extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createsubuser);
        View v = findViewById(R.id.createNewSubuserButton);
        v.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        if(arg0.getId() == R.id.createNewSubuserButton){
            EditText name = (EditText) findViewById(R.id.inputNameSubuser);
            String n = name.getText().toString();
            EditText position = (EditText) findViewById(R.id.inputPosition);
            String p = position.getText().toString();
            EditText email = (EditText) findViewById(R.id.inputEmail);
            String e = email.getText().toString();
            Boolean isAdmin = false;

            ParseObject user = new ParseObject("User");
            user.put("name", n);
            user.put("position", p);
            user.put("email", e);
            user.put("isAdmin", isAdmin);
            user.saveInBackground();

            Intent intent = new Intent(this,AdminDashboard.class);
            this.startActivity(intent);
        }
    }
}
