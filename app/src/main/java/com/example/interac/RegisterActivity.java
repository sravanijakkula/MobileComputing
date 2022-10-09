package com.example.interac;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button buttonReg= (Button)findViewById(R.id.buttonReg);
        buttonReg.setOnClickListener(new View.OnClickListener() {
//           btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this,LoginActivity.class));
                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
//                Intent i = new Intent(getApplicationContext(),RegisterActivity.class);
//          intent.putExtra("Sravs",1);
                startActivity(intent);

            }
        });
    }
}
