package com.example.homework7_;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

import com.example.homework7_.databinding.ActivityDashboardBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardActivity extends AppCompatActivity{
    String usernameLoginEdit; // Variabel anggota kelas
    ActivityDashboardBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = new Intent(this, ProfileActivity.class);
        usernameLoginEdit = getIntent().getStringExtra("USERNAME_EXTRA");
        TextView userDashTextView = findViewById(R.id.userDash);
        userDashTextView.setText(usernameLoginEdit);
        intent.putExtra("USERNAME_EXTRA", usernameLoginEdit);


    }

    public void profile(View view)
    {
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("USERNAME_EXTRA", usernameLoginEdit);
        startActivity(intent);
        finish(); // Menutup DashboardActivity agar tidak dapat kembali dengan tombol back
    }

}
