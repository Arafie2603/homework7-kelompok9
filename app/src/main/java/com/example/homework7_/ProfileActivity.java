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
    String usernameLoginEdit;
    String getPhoneEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        String usernameLoginEdit = getIntent().getStringExtra("USERNAME_EXTRA");
        TextView userDashTextView = findViewById(R.id.usernameProfile);
        userDashTextView.setText(usernameLoginEdit);

        String usernameProfileEdit = getIntent().getStringExtra("USERNAME_PROFILE");
        String phoneProfileEdit = getIntent().getStringExtra("PHONE_PROFILE");
        userDashTextView.setText(usernameProfileEdit);

        TextView phoneEdit = findViewById(R.id.nomorPro);
        phoneEdit.setText(phoneProfileEdit);

    }
    public void logout(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void edit(View view)
    {
        Intent intent1 = new Intent(this, EditProfile.class);
        startActivity(intent1);
    }
    public void backDashboard(View view)
    {
        Intent intent = new Intent(this, DashboardActivity.class);
        intent.putExtra("USERNAME_EXTRA", usernameLoginEdit);
        startActivity(intent);
    }



}
