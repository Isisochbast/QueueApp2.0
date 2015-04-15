package com.example.henriiv.queueapp20;

//Klassen där admins och subusers loggar in. De kan även gå till "Glömt lösenord" (klass ForgottenPassword).
//Användaren får fylla i sitt användarnamn och lösenord, vilket kollas mot databasen. Stämmer de loggas de in,
//annars dirigeras de om till ForgottenPassword (efter att ha angett fel lösen 10 ggr) och systemadministratörerna larmas.

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class AdminLogin extends Activity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminlogin);
        View v = findViewById(R.id.loginButton);
        v.setOnClickListener(this);
        View w = findViewById(R.id.forgottenPasswordButton);
        w.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        if(arg0.getId() == R.id.loginButton){
            Intent intent = new Intent(this,AdminDashboard.class);

            this.startActivity(intent);
        }
        if(arg0.getId() == R.id.forgottenPasswordButton){
            Intent intent = new Intent(this,ForgottenPassword.class);

            this.startActivity(intent);
        }
    }
}
