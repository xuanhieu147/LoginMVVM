package com.example.loginmvvm;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;

public class LoginViewModel extends BaseObservable {
    private String email;
    private String password;
    public ObservableField<String> messageLogin = new ObservableField<>();
    public ObservableField<Boolean> isShowMessage = new ObservableField<>();
    public ObservableField<Boolean> isSucess = new ObservableField<>();

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    public void onClickLogin() {
        User user = new User(getEmail(), getPassword());
        isShowMessage.set(true);
        if (user.isValidEmail() && user.isValidPassword() && user.getEmail().equals("hieu@gmail.com") && user.getPassword().equals("1234567")) {
            messageLogin.set("Login Success");
            isSucess.set(true);
        } else {
            messageLogin.set("Email or Password Invalid");
            isSucess.set(false);
        }

    }
}
