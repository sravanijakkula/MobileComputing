package com.example.interac;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SnapshotsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snapshots);

        ImageView imageView11back548=(ImageView) findViewById(R.id.imageView11back548);
        imageView11back548.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SnapshotsActivity.this, DashboardActivity.class);
                startActivity(i);
            }
        });
    }
}
