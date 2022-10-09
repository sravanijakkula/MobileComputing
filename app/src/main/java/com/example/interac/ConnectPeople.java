package com.example.interac;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ConnectPeople extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connectpeople);
        ImageView imageViewback584=(ImageView) findViewById(R.id.imageViewback584);
        imageViewback584.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ConnectPeople.this, DashboardActivity.class);
                startActivity(i);
            }
        });
    }
}
