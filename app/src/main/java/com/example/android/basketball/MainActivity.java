package com.example.android.basketball;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends  AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int counter_a = 0;
        int counter_b = 0;

        /**
         * This method is called when the order button is clicked.
         */
        public void team_a_3(View view) {
            counter_a = counter_a + 3;
            display_a(counter_a);
        }

        public void team_a_2(View view) {
            counter_a = counter_a + 2;
            display_a(counter_a);
        }

        public void team_a_throw(View view) {
            counter_a = counter_a + 1;
            display_a(counter_a);
        }

        public void team_b_3(View view) {
            counter_b = counter_b + 3;
            display_b(counter_b);
        }

        public void team_b_2(View view) {
            counter_b = counter_b + 2;
            display_b(counter_b);
        }

        public void team_b_throw(View view) {
            counter_b = counter_b + 1;
            display_b(counter_b);
        }

        public void reset(View view) {
            counter_a = 0;
            counter_b = 0;
            display_a(counter_a);
            display_b(counter_b);

        }

        /**
         * This method displays the given quantity value on the screen.
         */
        private void display_a(int number) {
            TextView quantityTextView = (TextView) findViewById(
                    R.id.team_a);
            quantityTextView.setText("" + number);
        }

        public  void display_b(int n) {

            TextView quantityTextView = (TextView) findViewById(R.id.team_b);
            quantityTextView.setText("" + n);
        }
    }



