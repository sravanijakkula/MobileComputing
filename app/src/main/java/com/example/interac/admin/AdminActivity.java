package com.example.interac.admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.interac.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class AdminActivity extends AppCompatActivity {
    Button button;
    EditText editTextUserName234;
    EditText editTextPassword123;

    FirebaseAuth fa = FirebaseAuth.getInstance();
    FirebaseFirestore fs = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

         button = findViewById(R.id.button);
        editTextUserName234 = findViewById(R.id.editTextUserName234);
        editTextPassword123 = findViewById(R.id.editTextPassword123);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = editTextUserName234.getText().toString().trim();
                String password = editTextPassword123.getText().toString();
                if (!email.equals("") && !password.equals("")) {
                    signin(email, password);
                } else {
                    Toast.makeText(AdminActivity.this, "Please enter the Username and Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void signin(String email, String password) {
        if (email.equals("interacproject@gmail.com") && password.equals("Interac@123")) {
            Intent i = new Intent(AdminActivity.this, ManageLocations.class);
            startActivity(i);
            Toast.makeText(AdminActivity.this, "Login Success!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(AdminActivity.this, "Please enter valid credentials", Toast.LENGTH_SHORT).show();
        }

    }
}

