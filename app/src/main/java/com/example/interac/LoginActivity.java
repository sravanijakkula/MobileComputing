package com.example.interac;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.interac.utils.EmailValidation;

public class LoginActivity extends AppCompatActivity {
    EditText editTextUserName234, editTextPassword123;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_login);


        editTextPassword123 = (EditText) findViewById(R.id.editTextPassword123);
        editTextUserName234 = (EditText) findViewById(R.id.editTextUserName234);


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // startActivity(new Intent(LoginActivity.this,DashboardActivity.class));
                if (validate()) {
                    Intent i = new Intent(LoginActivity.this, DashboardActivity.class);
                    startActivity(i);
                }

            }
        });
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // startActivity(new Intent(LoginActivity.this,DashboardActivity.class));
                Intent i = new Intent(LoginActivity.this, Reset1Activity.class);
                startActivity(i);

            }
        });
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // startActivity(new Intent(LoginActivity.this,DashboardActivity.class));
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);

            }
        });
    }

    public boolean validate() {
        boolean flag = true;
        if (editTextPassword123.getText().toString().trim().length() == 0) {

            flag = false;
            Toast.makeText(getApplicationContext(), "Password Required", Toast.LENGTH_SHORT).show();
            return flag;

        }

        if (editTextUserName234.getText().toString().trim().length() == 0) {

            flag = false;
            Toast.makeText(getApplicationContext(), "Email ID Required", Toast.LENGTH_SHORT).show();
            return flag;
        }
        if(!EmailValidation.isValid(editTextUserName234.getText().toString().trim())){

            flag = false;
            System.out.println("Email ID not valid");
            Toast.makeText(getApplicationContext(), "Email ID Required", Toast.LENGTH_SHORT).show();
            return flag;

        }


        return flag;
    }

}