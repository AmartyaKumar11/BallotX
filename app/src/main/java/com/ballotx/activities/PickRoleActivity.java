package com.ballotx.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ballotx.R;

public class PickRoleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pick_role);

        Button btnSignupVoter = findViewById(R.id.btnSignupVoter);
        Button btnSignupCandidate = findViewById(R.id.btnSignupCandidate);
        Button btnSignupAdmin = findViewById(R.id.btnSignupAdmin);

        btnSignupVoter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToSignup("Voter");
            }
        });

        btnSignupCandidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToSignup("Candidate");
            }
        });

        btnSignupAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToSignup("Admin");
            }
        });
    }

    private void navigateToSignup(String role) {
        Intent intent = new Intent(PickRoleActivity.this, SignupActivity.class);
        intent.putExtra("ROLE", role);
        startActivity(intent);
    }
}