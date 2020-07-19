package com.kleineerdbeere.kleineziege;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import static android.util.Log.i;

public class MainActivity extends AppCompatActivity {


    public void clickFunction(View view){


        Log.i("trace","Start button was pressed.");
        Log.i("Info","button was pressed.");
        Toast.makeText(this, "Thank you for input.", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}