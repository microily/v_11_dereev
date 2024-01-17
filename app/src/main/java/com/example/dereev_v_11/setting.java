package com.example.dereev_v_11;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class setting extends AppCompatActivity {

    private Switch switch1;
    private Switch switch2;
    private Switch switch3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_activity);

        switch1 = findViewById(R.id.switch1);
        switch2 = findViewById(R.id.switch2);
        switch3 = findViewById(R.id.switch3);

        initializeSwitches();

        Button resetButton = findViewById(R.id.buttonoff);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSettings();
            }
        });

        ImageView backButton = findViewById(R.id.imageButton3);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPersonalArea();
            }
        });
    }

    private void initializeSwitches() {

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                changeSwitchColor(switch1, isChecked);
            }
        });

        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                changeSwitchColor(switch2, isChecked);
            }
        });

        switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                changeSwitchColor(switch3, isChecked);
            }
        });
    }

    private void changeSwitchColor(Switch aSwitch, boolean isChecked) {
        // Change the color to red if the switch is checked
        int color = isChecked ? Color.RED : Color.BLACK;
        aSwitch.setTextColor(color);
    }

    private void resetSettings() {
        switch1.setChecked(false);
        switch2.setChecked(false);
        switch3.setChecked(false);

        switch1.setTextColor(Color.BLACK);
        switch2.setTextColor(Color.BLACK);
        switch3.setTextColor(Color.BLACK);
    }

    private void openPersonalArea() {
        Intent intent = new Intent(this, personal_area.class);
        startActivity(intent);
    }
}
