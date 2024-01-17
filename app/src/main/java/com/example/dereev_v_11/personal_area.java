package com.example.dereev_v_11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class personal_area extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area_activity);

        ImageButton settingsButton = findViewById(R.id.imageButton2);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettingsScreen();
            }
        });

        // Add an OnClickListener to the buttonCall
        Button callButton = findViewById(R.id.buttonCall);
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPhoneDialer();
            }
        });
    }

    private void openSettingsScreen() {
        Intent intent = new Intent(this, setting.class);
        startActivity(intent);
    }

    private void openPhoneDialer() {
        // Use ACTION_DIAL to open the dialer
        Intent intent = new Intent(Intent.ACTION_DIAL);
        startActivity(intent);
    }

    public void onBackButtonClick(View view) {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }
}
