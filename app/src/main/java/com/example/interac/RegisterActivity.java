package com.example.interac;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.interac.utils.EmailValidation;

//import com.example.interac.DB.SQLiteHelper;

public class RegisterActivity extends AppCompatActivity {

    Button buttonRegister;
    TextView textViewLogin11;
    EditText editTextTextUN, editTextTextESid, editTextTextPsw, editTextTextCpsw;
    SQLiteDatabase sqLiteDatabaseObj;
    //SQLiteHelper sqLiteHelper;
    Cursor cursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_register);

    //    sqLiteHelper = new SQLiteHelper(this);

        textViewLogin11 = (TextView) findViewById(R.id.textViewLogin11);

        editTextTextUN = (EditText) findViewById(R.id.editTextTextUN);
        editTextTextESid = (EditText) findViewById(R.id.editTextTextESid);
        editTextTextPsw = (EditText) findViewById(R.id.editTextTextPsw);
        editTextTextCpsw = (EditText) findViewById(R.id.editTextTextCpsw);

        buttonRegister = (Button) findViewById(R.id.buttonRegister);
        buttonRegister.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                if (validate()) {
                    Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(intent);
                }

            }
        });


        textViewLogin11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegisterActivity.this, LaunchScreen.class);
                startActivity(i);
            }
        });

    }

    public boolean validate() {
        boolean flag = true;
        if (editTextTextUN.getText().toString().trim().length() == 0) {
            Toast.makeText(getApplicationContext(), "UserName required", Toast.LENGTH_SHORT).show();
            flag = false;
            return flag;

        }
        if (editTextTextESid.getText().toString().trim().length() == 0) {
            Toast.makeText(getApplicationContext(), "Email ID required", Toast.LENGTH_SHORT).show();
            flag = false;
            return flag;


        }
        if (editTextTextPsw.getText().toString().trim().length() == 0) {
            Toast.makeText(getApplicationContext(), "Password required", Toast.LENGTH_SHORT).show();
            flag = false;
            return flag;

        }
        if (editTextTextCpsw.getText().toString().trim().length() == 0) {
            Toast.makeText(getApplicationContext(), "Confirm Password required", Toast.LENGTH_SHORT).show();
            flag = false;

            return flag;
        }

        if (!editTextTextPsw.getText().toString().trim().equals(editTextTextCpsw.getText().toString().trim())) {
            Toast.makeText(getApplicationContext(), "Password not matching", Toast.LENGTH_SHORT).show();
            flag = false;
            return flag;

        }

        if(!EmailValidation.isValid(editTextTextESid.getText().toString().trim())){

            flag = false;
            System.out.println("Email ID not valid");
            Toast.makeText(getApplicationContext(), "Email ID Required", Toast.LENGTH_SHORT).show();
            return flag;

        }

        return flag;

    }
}
