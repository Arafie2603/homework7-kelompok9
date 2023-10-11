package com.example.homework7_;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.homework7_.R;

public class EditProfile extends  AppCompatActivity{
    String usernameLoginEdit;
    String usernameProfileedit;
    String phoneProfileEdit;
    String editAddressProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);


    }
    public void backProfile(View view)
    {
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("USERNAME_EXTRA", usernameLoginEdit);
        startActivity(intent);
    }
    public void update(View view)
    {
        EditText usernameUpdate = findViewById(R.id.editName);
        usernameProfileedit = usernameUpdate.getText().toString();

        EditText phoneUpdate = findViewById(R.id.editPhone);
        phoneProfileEdit = phoneUpdate.getText().toString();

        EditText editAddress = findViewById(R.id.editAddress);
        editAddressProfile = phoneUpdate.getText().toString();

        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("USERNAME_PROFILE", usernameProfileedit);
        intent.putExtra("PHONE_PROFILE", phoneProfileEdit);
        intent.putExtra("ADDRESS_PROFILE", editAddressProfile);

        startActivity(intent);
    }
}
