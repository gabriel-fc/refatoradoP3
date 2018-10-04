package com.company.model.personPackage.employeeFactory;

import com.company.controller.SingletonInput;
import com.company.model.personPackage.Person;
import com.company.view.SingletonMessages;

public abstract class Employee extends Person {
    private float salary;
    private int employeeFunction;

    //all employees methods
    public Employee(int employeeFunction){
        SingletonInput newInput = SingletonInput.getInstance();
        SingletonMessages display = SingletonMessages.getInstance();

        this.employeeFunction = employeeFunction;
        display.generalMessages.showMessage(display.membersMessages.salaryMessage());
        this.salary = newInput.floatInput();
    }

    public int getEmployeeFunction(){
        return this.employeeFunction;
    }

    public float getSalary(){
        return this.salary;
    }

    public void setEmployeeFunction(int employeeFunction) {
        this.employeeFunction = employeeFunction;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String toString(){
        throw new UnsupportedOperationException();
    }


    //doctor methods
    public String getCrm(){
            throw new UnsupportedOperationException();
    }

    public void setCrm(String crm){throw new UnsupportedOperationException();}


    //driver methods
    public String getDriverLicense() {
        throw new UnsupportedOperationException();
    }

    public void setDriverLicense(String driverLicense) {
        throw new UnsupportedOperationException();
    }

    //players methods
    public int getPlayerFunction() {
        throw new UnsupportedOperationException();
    }

    public int getPlayerStatus(){
        throw new UnsupportedOperationException();
    }

    public void setPlayerFunction(int playerFunction) {
        throw new UnsupportedOperationException();
    }

    public void setPlayerStatus(int playerStatus) {
        throw new UnsupportedOperationException();
    }
}