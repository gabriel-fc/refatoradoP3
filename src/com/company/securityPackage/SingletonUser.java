package com.company.securityPackage;

import com.company.controller.SingletonInput;
import com.company.view.SingletonMessages;

public class SingletonUser {
    private String adminUser = "admin";

    private boolean isValidated = false;

    private static SingletonUser singleton = null;

    private SingletonUser(){}

    public static SingletonUser getInstance(){
        if (singleton == null){
            singleton = new SingletonUser();
        }
        return singleton;
    }


    protected void passwordValidation(String user){
        if (adminUser.compareTo(user) == 0){
            isValidated = true;
        }
    }

    public boolean isValidated(){
        return isValidated;
    }

    public void getUser(){
        SingletonInput input = SingletonInput.getInstance();
        SingletonMessages display = SingletonMessages.getInstance();
        display.loginMessages.enterUserMessage();
        for (int i = 3; i > 0; i--) {
            if (adminUser.compareTo(input.simpleString()) == 0){
                this.isValidated = true;
                return;
            }
            if(i > 1)display.loginMessages.wrongUserMessage(i-1);
        }
    }
}
