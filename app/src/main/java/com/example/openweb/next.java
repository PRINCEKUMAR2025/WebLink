package com.example.openweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class next extends AppCompatActivity {
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(next.this,com.example.openweb.MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void launchyt(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"));
        startActivity(intent);
    }

    public void launchtwit(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/i/flow/login"));
        startActivity(intent);
    }
}