package com.example.interac;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class ConnectPeople extends AppCompatActivity {
    Button Alumni584, button2employees584, Faculty584, Ra584, button5Stud584, Upd584;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_connectpeople);

        Alumni584 = (Button) findViewById(R.id.Alumni584);
        button2employees584 = (Button) findViewById(R.id.button2employees584);
        Faculty584 = (Button) findViewById(R.id.Faculty584);
        Ra584 = (Button) findViewById(R.id.Ra584);
        button5Stud584 = (Button) findViewById(R.id.button5Stud584);
        Upd584 = (Button) findViewById(R.id.Upd584);

        Alumni584.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert();
            }
        });

        button2employees584.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert();
            }
        });
        Faculty584.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert();
            }
        });
        Ra584.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert();
            }
        });
        button5Stud584.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert();
            }
        });
        Upd584.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert();
            }
        });

        TextView profile = (TextView) findViewById(R.id.profile584);

        profile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(ConnectPeople.this, Profile.class);
                startActivity(i);
            }
        });
    }


    public void alert() {
        Intent i = new Intent(ConnectPeople.this, ConnectPeopleResults.class);
        startActivity(i);

//        AlertDialog.Builder alert = new AlertDialog.Builder(this);
//
//        alert.setTitle("Conenct");
//        alert.setMessage("Enter ID To Connect");
//
//// Set an EditText view to get user input
//        final EditText input = new EditText(this);
//        alert.setView(input);
//
//        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int whichButton) {
//
//                // Do something with value!
//            }
//        });
//
//        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int whichButton) {
//                // Canceled.
//            }
//        });
//
//        alert.show();
//
    }
}
