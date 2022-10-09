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
                Intent i = new Intent(DashboardActivity.this, AcademicCalendar.class);
                startActivity(i);
            }
        });
        ImageView imageViewCampRes=(ImageView) findViewById(R.id.imageViewCampRes);
        imageViewCampRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this, CampusResourcesActivity.class);
                startActivity(i);
            }
        });

        ImageView imageViewConPpl=(ImageView) findViewById(R.id.imageViewConPpl);
        imageViewConPpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this, ConnectPeople.class);
                startActivity(i);
            }

        });
        ImageView imageView8FC=(ImageView) findViewById(R.id.imageView8FC);
        imageView8FC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this, HangoutsActivity.class);
                startActivity(i);
            }

        });

        ImageView imageViewEvents=(ImageView) findViewById(R.id.imageViewEvents);
        imageViewEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this, EventsActivity.class);
                startActivity(i);
            }

        });


        ImageView imageView18Org514=(ImageView) findViewById(R.id.imageView18Org514);
        imageView18Org514.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this, OrganizationActivity.class);

                startActivity(i);
            }

        });
        ImageView imageView19Snap514=(ImageView) findViewById(R.id.imageView19Snap514);
        imageView19Snap514.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this, SnapshotsActivity.class);

                startActivity(i);
            }

        });

    }
}