package com.example.augmentedhighereducationfortruckdrivers;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class ProgressActivity extends AppCompatActivity {

    private Button quit;

    //Create help page
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        //The button of home page
        quit = findViewById(R.id.node_name_view1);

        //Click the home button and jump to home page
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View section) {

                Intent intent = new Intent(ProgressActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }
}
