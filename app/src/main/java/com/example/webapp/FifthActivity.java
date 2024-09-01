package com.example.webapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FifthActivity extends AppCompatActivity {
    Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fifth);
        Button button1=findViewById(R.id.button6);
        Button button2=findViewById(R.id.button7);
        Button button3=findViewById(R.id.button8);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FifthActivity.this, MainActivity7.class);
                intent.putExtra("Url","https://www.zaubacorp.com/company/GOOGLE-INDIA-PRIVATE-LIMITED/U72900KA2003PTC033028");
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FifthActivity.this, MainActivity7.class);
                intent.putExtra("url","https://www.youtube.com/channel/UCKZsdWVRrTjzzoMbYmnCgtg");
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FifthActivity.this, MainActivity7.class);
                intent.putExtra("url","https://cloud.google.com/");
                startActivity(intent);
            }
        });
    }

    }
