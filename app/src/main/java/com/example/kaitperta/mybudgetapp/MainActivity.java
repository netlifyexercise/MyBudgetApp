package com.example.kaitperta.mybudgetapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView dateTextView = (TextView) findViewById(R.id.dateTextView);
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMM dd, yyyy");
        String dateString = formatter.format(new Date());
        dateTextView.setText(dateString);

        //create reference to editText button
        Button editBudgetBtn = (Button) findViewById(R.id.editBudgetBtn);
        editBudgetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), WeeklyBudget.class);
                startActivity(startIntent);
            }
        });
    }



}
