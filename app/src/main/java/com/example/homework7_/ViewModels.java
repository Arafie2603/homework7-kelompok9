package com.example.homework7_;
import android.widget.EditText;

import androidx.lifecycle.MutableLiveData;
import android.widget.EditText;
public class ViewModels extends androidx.lifecycle.ViewModel {
    public MutableLiveData<String> username = new MutableLiveData<>();
    public MutableLiveData<String> password = new MutableLiveData<>();
    public MutableLiveData<Integer> toLogin = new MutableLiveData<>();
    public String correctPass = "123";


    public void login()
    {
        if (password.getValue().equals(correctPass)) {
            toLogin.setValue(1);
        }else {
            toLogin.setValue(2);
        }
    }
}
