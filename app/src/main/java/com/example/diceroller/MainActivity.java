package com.example.diceroller;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import java.time.Clock;
import java.util.Random;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @SuppressLint("SetTextI18n")
    public void on_button_click(View view) {
        EditText et = this.findViewById(R.id.textInputEditText2);
        TextView ScoreBoard = this.findViewById(R.id.Score);
        TextView tv = this.findViewById(R.id.numberTextView);
        TextView congrats = this.findViewById(R.id.congrats);
        congrats.setText("");
        Random r = new Random();
        String number = Integer.toString(r.nextInt(6) + 1);
        tv.setText(number);
        String InputtedValue = et.getText().toString();
        System.out.println("number is " + number);
        System.out.println("your input is " + InputtedValue);
        int score = Integer.parseInt(ScoreBoard.getText().toString());
        System.out.println("The current score is "+score);
        if (number.equalsIgnoreCase(InputtedValue)) {
            System.out.println("Congrats");
            congrats.setText("Congratulations!");
            score ++;
            System.out.println("The current score is "+score);
            ScoreBoard.setText(Integer.toString(score));


        }
    }

}
