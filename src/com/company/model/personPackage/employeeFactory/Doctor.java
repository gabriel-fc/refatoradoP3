package com.company.model.personPackage.employeeFactory;

import com.company.controller.*;
import com.company.model.enums.EmployeeType;
import com.company.view.*;
import com.company.view.messagesPackage.MembersDefaultMessages;

public class Doctor extends Employee {
    private String crm;

    public Doctor(int employeeFunction){
        super(employeeFunction);
        SingletonInput newInput = SingletonInput.getInstance();
        SingletonMessages display = SingletonMessages.getInstance();
        display.generalMessages.showMessage(display.membersMessages.crmMessage());
        this.crm = newInput.longInput();
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
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
                + newOutput.salaryMessage() + super.getSalary()+ "\n"
                + newOutput.crmMessage() + this.crm + "\n";


    }
}
