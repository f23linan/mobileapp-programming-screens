package com.example.screens;

import static androidx.core.content.ContextCompat.startActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>","Lets go!");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", "Daniel"); // Optional
                intent.putExtra("number", 1); // Optional
                startActivity(intent);
            }
        });

    }



}
