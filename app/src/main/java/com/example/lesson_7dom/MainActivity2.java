package com.example.lesson_7dom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView tvText;
private Button f;
static Boolean fi=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvText=findViewById(R.id.tvText);
        String text = getIntent().getStringExtra("key");
        if(!text.isEmpty())
            tvText.setText(text);

        f=findViewById(R.id.finish);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fi==true) {
                    finish();
                    fi=false;
                }
            }
        });

    }
}