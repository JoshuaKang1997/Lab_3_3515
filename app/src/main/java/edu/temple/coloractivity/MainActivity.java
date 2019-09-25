package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);

        String[] colors = {"Red", "Green", "Blue", "Magenta", "Cyan", "Black", "Yellow", "Purple",
                "Lime", "White"};

        ColorAdapter adapter = new ColorAdapter(MainActivity.this, colors);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                adapterView.setBackgroundColor(Color.parseColor("White"));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
    }
}