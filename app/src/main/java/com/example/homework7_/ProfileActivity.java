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

        Intent intent = getIntent();
        usernameLoginEdit = intent.getStringExtra("USERNAME_EXTRA");

        TextView userDashTextView = findViewById(R.id.usernameProfile);
        userDashTextView.setText(usernameLoginEdit);

        String usernameProfileEdit = intent.getStringExtra("USERNAME_PROFILE");
        TextView userEdit = findViewById(R.id.usernameProfile2); // Sesuaikan ID yang ingin ditampilkan
        userEdit.setText(usernameProfileEdit);

        String phoneProfileEdit = intent.getStringExtra("PHONE_PROFILE");
        TextView phoneEdit = findViewById(R.id.nomorPro);
        phoneEdit.setText(phoneProfileEdit);

        String addressProfileEdit = intent.getStringExtra("ADDRESS_PROFILE");
        TextView addressEdit = findViewById(R.id.alamatPro);
        addressEdit.setText(addressProfileEdit);






    }
    public void logout(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("USERNAME_EXTRA", usernameLoginEdit);
        startActivity(intent);
    }
    public void edit(View view)
    {
        Intent intent1 = new Intent(this, EditProfile.class);
        intent1.putExtra("USERNAME_EXTRA", usernameLoginEdit);
        startActivity(intent1);
    }
    public void backDashboard(View view)
    {
        Intent intent = new Intent(this, DashboardActivity.class);
        intent.putExtra("USERNAME_EXTRA", usernameLoginEdit);
        startActivity(intent);
    }



}
