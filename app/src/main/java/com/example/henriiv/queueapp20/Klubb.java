package com.example.henriiv.queueapp20;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Klubb extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_klubb);
        //Layout i java?

        //Kan denna funktion återanvändas i pubklassen också?

        //Ska hämta aktuella klubbar
        //Gör en knapp för varje klubb
        //Knapparna har olika färg beroende på köläget, (obs tänk på färgblinda!)
        //Ställ dig i kö genom att trycka på aktuell klubb --> info till parse
    /*Tre alt efter en har ställt sig i kön 1. inne på klubben. 2. går ur kön. 3. varning en in en ut
    -->info till parse*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_klubb, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
