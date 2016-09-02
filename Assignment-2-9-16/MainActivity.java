package com.example.simha.acttest;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {
    AutoCompleteTextView actv;
    String [] values;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actv=(AutoCompleteTextView) findViewById(R.id.auto);
        values=getResources().getStringArray(R.array.values);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,values);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
        actv.setTextColor(Color.BLACK);


    }
}
