package com.example.interac;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class OrganizationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organization);

        ImageView imageView5Back1514=(ImageView) findViewById(R.id.imageView5Back1514);
        imageView5Back1514.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(OrganizationActivity.this, DashboardActivity.class);
                startActivity(i);
            }
        });
    }
}
