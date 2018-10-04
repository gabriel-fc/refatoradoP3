package com.company.model.personPackage.employeeFactory;

import com.company.controller.*;
import com.company.model.enums.EmployeeType;
import com.company.view.*;
import com.company.view.messagesPackage.MembersDefaultMessages;


public class Driver extends Employee {
    private String driverLicense;

   public Driver(int employeeFunction){
       super(employeeFunction);
       SingletonInput newInput = SingletonInput.getInstance();
       SingletonMessages dispay = SingletonMessages.getInstance();

       dispay.generalMessages.showMessage(dispay.membersMessages.driverLicenseMessage());
        this.driverLicense = newInput.longInput();
    }

    public String getDriverLicense() {
        return this.driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String toString(){
        MembersDefaultMessages newOutput = new MembersDefaultMessages();
        ToStringFunctions stringFunction = new ToStringFunctions();

        return newOutput.fullNameMessage() + super.getFullName() + "\n"
                + newOutput.cpfMessage() + super.getCpf() + "\n"
                + newOutput.emailMessage() + super.getEmail() + "\n"
                + newOutput.phoneMessage() + super.getPhone() + "\n"
                + newOutput.functionMessage() + EmployeeType.
                getKey(super.getEmployeeFunction()) + "\n"
                + newOutput.salaryMessage() + super.getSalary() + "\n"
                + newOutput.driverLicenseMessage() + this.driverLicense + "\n";


    }
}
