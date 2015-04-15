package com.example.henriiv.queueapp20;

//Klassen där admins kan skapa nya subusers. Användaren fyller i subuserns
//- namn
//- "position", vilket ex. kan vara 1Q eller namnet på den klubb subusern anordnar
//- email
//När subusern skapas får hen ett mail med ett automatiskt genererat lösenord.

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

import java.text.ParseException;

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
            EditText password = (EditText) findViewById(R.id.inputUserPassword);
            String pa = email.getText().toString();
            Boolean isAdmin = false;

            ParseUser user = new ParseUser();
            user.setUsername(n);
            user.setPassword(pa);
            user.setEmail(e);
            user.put("name", n);
            user.put("position", p);
            user.put("email", e);
            user.put("isAdmin", isAdmin);
            user.signUpInBackground();
                //OM SUCCESSFUL GE BEKRÄFTELSE PÅ SKAPAD SUBUSER

            Intent intent = new Intent(this, AdminDashboard.class);
                this.startActivity(intent);
            }
        }
}
