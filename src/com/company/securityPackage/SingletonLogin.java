package com.company.securityPackage;

import com.company.view.SingletonMessages;

public class SingletonLogin {
    private static boolean isValidated = false;

    private static SingletonLogin singleton = null;

    private SingletonLogin(){}

    public static SingletonLogin getInstance(){
        if (singleton == null){
            singleton = new SingletonLogin();
        }
        return singleton;
    }

    public void validation(){
        SingletonMessages display = SingletonMessages.getInstance();
        display.loginMessages.setLoginMessage();

        SingletonUser user = SingletonUser.getInstance();
        SingletonPassword password = SingletonPassword.getInstance();

        user.getUser();
        if (!user.isValidated()){
            return;
        }

        password.getPassword();
        if (password.isValidated()){
            isValidated = true;
        }
    }

    public boolean isValidated() {
        return isValidated;
    }
}

