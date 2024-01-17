package com.example.dereev_v_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {

    Button btn;
    EditText et,pt;
    private String login;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        btn = findViewById(R.id.button);
        et = findViewById(R.id.editTextText);
        pt = findViewById(R.id.editTextTextPassword);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputlogin = et.getText().toString();
                String inputPassword = pt.getText().toString();

                boolean isUserValid = checkUser(inputlogin, inputPassword);

                if (isUserValid) {
                    Intent intent = new Intent(login.this, personal_area.class);
                    intent.putExtra("username", "Ilya");
                    startActivity(intent);
                } else {
                }
            }
        });

        createUser( "1111", "1111");
    }

    private void createUser(String login, String password) {
        this.login = login;
        this.password = password;
    }

    private boolean checkUser(String inputUsername, String inputPassword) {
        return inputUsername.equals(login) && inputPassword.equals(password);
    }
}