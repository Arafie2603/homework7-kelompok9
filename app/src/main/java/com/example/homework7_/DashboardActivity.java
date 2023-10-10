package com.example.homework7_;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;

import com.example.homework7_.R;
import com.example.homework7_.databinding.ActivityMainBinding;

public class DashboardActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        String usernameLoginEdit = getIntent().getStringExtra("USERNAME_EXTRA");

        TextView userDashTextView = findViewById(R.id.userDash);
        userDashTextView.setText(usernameLoginEdit);


    }
    public void profile(View view)
    {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent); // Menggunakan intent yang sudah diisi dengan username
    }
}
