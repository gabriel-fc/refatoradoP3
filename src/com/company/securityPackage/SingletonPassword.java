package com.company.securityPackage;

import com.company.controller.SingletonInput;
import com.company.view.SingletonMessages;

public class SingletonPassword {
    private String adminPassword = "123456";
    private boolean isValidated = false;

    private static SingletonPassword singleton = null;

    private SingletonPassword(){}

    public static SingletonPassword getInstance(){
        if (singleton == null){
            singleton = new SingletonPassword();
        }
        return singleton;
    }


    protected void passwordValidation(String password){
        if (adminPassword.compareTo(password) == 0){
            isValidated = true;
        }
    }

    public boolean isValidated(){
        return isValidated;
    }

    public void getPassword(){
        SingletonInput input = SingletonInput.getInstance();
        SingletonMessages display = SingletonMessages.getInstance();
        display.loginMessages.enterPasswordMessage();
        for (int i = 3; i > 0; i--) {
            if (adminPassword.compareTo(input.simpleString()) == 0){
                this.isValidated = true;
                return;
            }
            if(i > 1)display.loginMessages.wrongPasswordMessage(i-1);
        }
    }
}
