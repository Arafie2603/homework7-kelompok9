package com.example.homework7_;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.homework7_.R;

public class ProfileActivity extends  AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        String usernameLoginEdit = getIntent().getStringExtra("USERNAME_EXTRA");

        TextView userDashTextView = findViewById(R.id.usernamePro);
        userDashTextView.setText(usernameLoginEdit);

    }
    public void logout(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish(); // Menutup DashboardActivity agar tidak dapat kembali dengan tombol back
    }
}
