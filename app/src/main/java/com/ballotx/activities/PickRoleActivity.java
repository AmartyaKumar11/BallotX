package com.ballotx.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ballotx.R;

public class PickRoleActivity extends AppCompatActivity {

    private Button btnSignupVoter, btnSignupCandidate, btnSignupAdmin, btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_role);

        // Initialize the buttons
        btnSignupVoter = findViewById(R.id.btnSignupVoter);
        btnSignupCandidate = findViewById(R.id.btnSignupCandidate);
        btnSignupAdmin = findViewById(R.id.btnSignupAdmin);
        btnCreate = findViewById(R.id.btnCreate);

        // Set onClickListeners to handle button clicks
        btnSignupVoter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Sign up as Voter
                Toast.makeText(PickRoleActivity.this, "Sign up as Voter", Toast.LENGTH_SHORT).show();
                // You can navigate to the next activity here
            }
        });

        btnSignupCandidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Sign up as Candidate
                Toast.makeText(PickRoleActivity.this, "Sign up as Candidate", Toast.LENGTH_SHORT).show();
                // You can navigate to the next activity here
            }
        });

        btnSignupAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Sign up as Admin
                Toast.makeText(PickRoleActivity.this, "Sign up as Admin", Toast.LENGTH_SHORT).show();
                // You can navigate to the next activity here
            }
        });

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Create Account
                Toast.makeText(PickRoleActivity.this, "Create Account", Toast.LENGTH_SHORT).show();
                // You can navigate to the next activity here
            }
        });
    }
}
