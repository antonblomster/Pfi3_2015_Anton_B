package com.example.anton.assignment_1;

import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends ActionBarActivity {
    /*deklarera dina views*/
    TextView quoteText;
    Button quoteButton;

    int[]stringQuotes = {R.string.quote1, R.string.quote2, R.string.quote3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); /*ritar användargränsnittet - returnerar XML-filen*/

        /*hitta dina views (knapp & text)*/
        quoteText = (TextView) findViewById(R.id.quoteText);
        quoteButton = (Button) findViewById(R.id.quoteButton);

        /*lyssnare - hämtar info från dina views*/
        quoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = new Random().nextInt(3);
                String randomString = getString(stringQuotes[number]);
                Log.i("MainActivity", "Button pressed"); /*skriv ut i konsollen när mainactivity startas och när knapp blir tryckt*/
                quoteText.setText(randomString);
                //quotes[0]
            }
        });


    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop", "Activity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "Activity destroyed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause", "Activity destroyed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume", "Activity resumed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart", "Activity started");
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return false;
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
