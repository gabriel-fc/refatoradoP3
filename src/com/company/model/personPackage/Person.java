package com.company.model.personPackage;

import com.company.controller.SingletonInput;
import com.company.view.*;


 public abstract class Person {
   private String fullName;
   private String email;
   private String cpf;
   private String phone;

public Person() {
        SingletonInput newInput = SingletonInput.getInstance();
        SingletonMessages display = SingletonMessages.getInstance();
        display.generalMessages.showMessage(display.membersMessages.fullNameMessage());
        this.fullName = newInput.simpleString();
        display.generalMessages.showMessage(display.membersMessages.cpfMessage());
        this.cpf = newInput.longInput();
        display.generalMessages.showMessage(display.membersMessages.emailMessage());
        this.email = newInput.emailInput();
        display.generalMessages.showMessage(display.membersMessages.phoneMessage());
        this.phone = newInput.longInput();
    }


    public String getFullName(){
        return this.fullName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;

    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

}
