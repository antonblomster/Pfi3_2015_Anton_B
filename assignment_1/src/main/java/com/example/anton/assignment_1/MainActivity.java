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
    TextView quoteText;
    Button quoteButton;
    //private String[] quotes = getResources().getStringArray(R.array.quotes);


    int[]stringQuotes = {R.string.quote1, R.string.quote2, R.string.quote3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        quoteText = (TextView) findViewById(R.id.quoteText);
        quoteButton = (Button) findViewById(R.id.quoteButton);

        quoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = new Random().nextInt(3);
                String randomString = getString(stringQuotes[number]);
                Log.i("MainActivity", "Button pressed");
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
    }

    @Override
    protected void onStart() {
        super.onStart();
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
