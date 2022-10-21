package com.example.interac;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardMenu extends AppCompatActivity {
    TextView myProfile,writePost,logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_dashboard_menu);



        myProfile=(TextView) findViewById(R.id.myProfile);
        writePost=(TextView) findViewById(R.id.writePost);
        logout=(TextView) findViewById(R.id.logout);

        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DashboardMenu.this, MyProfileActivity.class);
                startActivity(i);
            }
        });
        writePost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DashboardMenu.this, WritePost.class);
                startActivity(i);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DashboardMenu.this, LoginActivity.class);
                startActivity(i);
            }
        });

    }
}