package com.example.multiplicationtablegenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/nevis.ttf");
        TextView txt = findViewById(R.id.text);
        txt.setTypeface(font);
        EditText editText = findViewById(R.id.editTextEnterPassword);
        editText.setTypeface(font);
        Button bt = findViewById(R.id.generateButton);

        bt.setTypeface(font);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, TablesActivity.class);
                it.putExtra("number",Integer.parseInt(editText.getText().toString()));
                startActivity(it);
            }
        });

    }
}