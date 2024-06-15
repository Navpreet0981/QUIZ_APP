package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.net.InetSocketAddress;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        RadioButton radioButton1 = findViewById(R.id.radioButton1);
        RadioButton radioButton2 = findViewById(R.id.radioButton2);
        RadioButton radioButton3 =  findViewById(R.id.radioButton3);

        Button submit = findViewById(R.id.button2);

        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.radioButton1){

                Toast.makeText(MainActivity3.this, "Apple Selected", Toast.LENGTH_SHORT).show();

            }else if (checkedId == R.id.radioButton2){
                Toast.makeText(MainActivity3.this, "Microsoft selected ", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(MainActivity3.this, "Google Selected", Toast.LENGTH_SHORT).show();
            }

            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (checkedId == R.id.radioButton3){
                        Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                        startActivity(intent);
                        finish();
                    }else{
                        Intent intent = new Intent(MainActivity3.this, MainActivity5.class);
                        startActivity(intent);

                    }
                    finish();
                }
            });
        });


    }
}