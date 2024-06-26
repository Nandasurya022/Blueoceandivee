package com.example.blueoceandive;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activity_dashboard extends AppCompatActivity {

    private ImageView profileImageView;
    private Button allButton, tripPackagesButton, galleryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Initialize views
        profileImageView = findViewById(R.id.profile);
        allButton = findViewById(R.id.allButton);
        tripPackagesButton = findViewById(R.id.trippackagesButton);
        galleryButton = findViewById(R.id.galleryButton);

        // Set listeners
        profileImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle profile image click
                Toast.makeText(activity_dashboard.this, "Profile clicked", Toast.LENGTH_SHORT).show();
            }
        });

        allButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle All button click
                Toast.makeText(activity_dashboard.this, "All button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        tripPackagesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle Trip Packages button click
                Toast.makeText(activity_dashboard.this, "Trip Packages button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        galleryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle Gallery button click
                Toast.makeText(activity_dashboard.this, "Gallery button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        // Example of setting data passed from login activity
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");

        TextView greetingTextView = findViewById(R.id.greetingTextView);
        greetingTextView.setText("Hi, " + name);
    }
}
