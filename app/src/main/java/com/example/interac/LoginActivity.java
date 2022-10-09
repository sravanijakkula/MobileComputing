package com.example.interac;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // startActivity(new Intent(LoginActivity.this,DashboardActivity.class));
                Intent i = new Intent(LoginActivity.this,DashboardActivity.class);
                startActivity(i);

            }
        });
        TextView textView3=(TextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // startActivity(new Intent(LoginActivity.this,DashboardActivity.class));
                Intent i = new Intent(LoginActivity.this,Reset1Activity.class);
                startActivity(i);

            }
        });

        ImageView imageView7=(ImageView) findViewById(R.id.imageView7);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(LoginActivity.this,LaunchScreen.class);
                startActivity(i);
            }
        });
    }
}