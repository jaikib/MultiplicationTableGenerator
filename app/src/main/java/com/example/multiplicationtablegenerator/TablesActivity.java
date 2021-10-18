package com.example.multiplicationtablegenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TablesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);
        int number = getIntent().getIntExtra("number",0);
        ImageButton ig = findViewById(R.id.backButton);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        //LinearLayout linearLayout = findViewById(R.id.linearLayout);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/nevis.ttf");
        TextView tv = findViewById(R.id.tableText);
        tv.setTypeface(font);
        for(int i =1 ;i<=10;i++){
            String text = tv.getText().toString();
            tv.setText(text+"\n"+number + " X "+i+" = "+number*i);

          //  linearLayout.addView(tv);
        }


    }
}