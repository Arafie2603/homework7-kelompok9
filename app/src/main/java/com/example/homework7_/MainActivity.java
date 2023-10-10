package com.example.homework7_;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import com.example.homework7_.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ViewModels viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        viewModel = new ViewModelProvider(this).get(ViewModels.class);
        binding.setViewModel(viewModel);

        viewModel.toLogin.observe(this, value -> {
            if(value.equals(1)) {
                EditText usernameLogin = findViewById(R.id.Username);
                String username = usernameLogin.getText().toString();
                Intent intent = new Intent(this, DashboardActivity.class);
                intent.putExtra("USERNAME_EXTRA", username);
                startActivity(intent); // Menggunakan intent yang sudah diisi dengan username
            }else if(value.equals(2)) {
                Toast.makeText(this, "Password Invalid", Toast.LENGTH_SHORT).show();
            }
        });
    }
}