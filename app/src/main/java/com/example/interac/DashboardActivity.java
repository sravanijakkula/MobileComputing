package com.example.interac;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ImageView imageViewAboutUs=(ImageView) findViewById(R.id.imageViewAboutus);
        imageViewAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DashboardActivity.this, AboutUsActivity.class);
                startActivity(i);
            }
        });
        ImageView imageView5AcadCal=(ImageView) findViewById(R.id.imageView5AcadCal);
        imageView5AcadCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DashboardActivity.this, AboutUsActivity.class);
                startActivity(i);
            }
        });
        ImageView imageViewCampRes=(ImageView) findViewById(R.id.imageViewCampRes);
        imageViewCampRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this, AboutUsActivity.class);
                startActivity(i);
            }
        });

        ImageView imageViewConPpl=(ImageView) findViewById(R.id.imageViewConPpl);
        imageViewConPpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this, AboutUsActivity.class);
                startActivity(i);
            }

        });
        ImageView imageView8FC=(ImageView) findViewById(R.id.imageView8FC);
        imageView8FC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this, AboutUsActivity.class);
                startActivity(i);
            }

        });
        //                         ImageView imageViewConPpl=(ImageView) findViewById(R.id.imageViewConPpl);

    }
}