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

public class ThirdActivity extends AppCompatActivity {
    private  Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_third);
        Button button1=findViewById(R.id.button2);
        Button button2=findViewById(R.id.button3);
        Button button3=findViewById(R.id.button4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this, MainActivity5.class);
                intent.putExtra("Url","https://www.justdial.com/jdmart/Bangalore/Microsoft-Corporation-India-Pvt-Ltd-Marathahalli-Bellandur/080PXX80-XX80-180824185912-K5P5_BZDET/catalogue");
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ThirdActivity.this,MainActivity5.class);
                intent.putExtra("Url","https://www.microsoft.com/en-in/about/contact-us");
                startActivity(intent);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this, MainActivity5.class);
                intent.putExtra("Url","https://www.microsoft.com/en-in/microsoft-teams/group-chat-software");
                startActivity(intent);
            }
        });
    }
}