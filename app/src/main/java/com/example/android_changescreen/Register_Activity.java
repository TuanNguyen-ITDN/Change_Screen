package com.example.android_changescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Register_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_);

        TextView textView = (TextView)findViewById(R.id.textView);

        textView.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent inn1 = new Intent(Register_Activity.this, MainActivity.class);
                startActivity(inn1);
            }

        });
    }
}
