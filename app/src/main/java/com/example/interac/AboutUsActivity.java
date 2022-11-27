package com.example.interac;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class AboutUsActivity extends AppCompatActivity {

    TextView aboutus, quality, laptop;
    ImageButton instagram, facebook, twitter, tiktok, linkedin, youtube;
    FirebaseFirestore fs = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_about_us);

        aboutus = findViewById(R.id.aboutus);
        quality = findViewById(R.id.quality);
        laptop = findViewById(R.id.laptop);
        fs.collection("About Us").document("aboutus").get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot d) {
                if(d.exists()){
                    aboutus.setText(d.getString("About Us"));
                    quality.setText(d.getString("Quality Academics"));
                    laptop.setText(d.getString("Laptop"));
                }
            }
        });

        instagram = findViewById(R.id.instagram);
        facebook = findViewById(R.id.facebook);
        twitter = findViewById(R.id.twitter);
        youtube = findViewById(R.id.youtube);
        linkedin = findViewById(R.id.linkedin);
        tiktok = findViewById(R.id.tiktok);

        instagram.setOnClickListener(new View.OnClickListener ()
        {
            @Override
            public void onClick(View v) {
                Intent myWebLink = new Intent(Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://www.instagram.com/nwmostate/"));
                startActivity(myWebLink);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener ()
        {
            @Override
            public void onClick(View v) {
                Intent myWebLink = new Intent(Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://www.facebook.com/nwmissouri"));
                startActivity(myWebLink);
            }
        });

        twitter.setOnClickListener(new View.OnClickListener ()
        {
            @Override
            public void onClick(View v) {
                Intent myWebLink = new Intent(Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://twitter.com/nwmostate"));
                startActivity(myWebLink);
            }
        });

        youtube.setOnClickListener(new View.OnClickListener ()
        {
            @Override
            public void onClick(View v) {
                Intent myWebLink = new Intent(Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://www.youtube.com/user/NorthwestVideo"));
                startActivity(myWebLink);
            }
        });

        linkedin.setOnClickListener(new View.OnClickListener ()
        {
            @Override
            public void onClick(View v) {
                Intent myWebLink = new Intent(Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://www.linkedin.com/school/northwest-missouri-state-university_2/"));
                startActivity(myWebLink);
            }
        });

        tiktok.setOnClickListener(new View.OnClickListener ()
        {
            @Override
            public void onClick(View v) {
                Intent myWebLink = new Intent(Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://www.tiktok.com/@nwmostate"));
                startActivity(myWebLink);
            }
        });


    }
}
