package com.example.interac;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CampusResourcesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus_resources);
        ImageView imageView8=(ImageView) findViewById(R.id.imageView8);
        //ImageView imageViewAboutUs=(ImageView) findViewById(R.id.imageViewAboutus);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CampusResourcesActivity.this, DashboardActivity.class);
                startActivity(i);
            }
        });
    }
}
