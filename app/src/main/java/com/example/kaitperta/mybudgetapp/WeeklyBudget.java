package com.example.kaitperta.mybudgetapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class WeeklyBudget extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_budget);
    }
        Button updateBtn = (Button) findViewById(R.id.updateBtn);

        EditText foodEditText = (EditText) findViewById(R.id.foodEditText);
        EditText miscEditText = (EditText) findViewById(R.id.miscEditText);
        EditText gasEditText = (EditText) findViewById(R.id.gasEditText);

        int food =Integer.parseInt(foodEditText.getText().toString());
        int misc =Integer.parseInt(miscEditText.getText().toString());
        int gas =Integer.parseInt(gasEditText.getText().toString());

}
