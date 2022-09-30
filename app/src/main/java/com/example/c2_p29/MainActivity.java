package com.example.c2_p29;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcal(View view){
        EditText numapple = findViewById(R.id.textView4);
        EditText numcoke = findViewById(R.id.textView5);
        EditText numfries = findViewById(R.id.textView6);
        TextView total = findViewById(R.id.textView7);
        int[] calorie= {90, 140, 365};
        int numa = Integer.parseInt(numapple.getText().toString());
        int numc = Integer.parseInt(numcoke.getText().toString());
        int numf = Integer.parseInt(numfries.getText().toString());

        total.setText(String.valueOf(calorie[0]*numa+calorie[1]*numc+calorie[2]*numf));
    }

}