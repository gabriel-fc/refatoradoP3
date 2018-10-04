package com.company.model.personPackage.employeeFactory;

import com.company.model.enums.EmployeeType;
import com.company.view.ToStringFunctions;
import com.company.view.messagesPackage.MembersDefaultMessages;

public class GeneralEmployee extends Employee {


    public GeneralEmployee(int employeeFunction){
        super(employeeFunction);
        }


    public String toString(){
        MembersDefaultMessages newOutput = new MembersDefaultMessages();
        ToStringFunctions stringFunction = new ToStringFunctions();

        return newOutput.fullNameMessage() + super.getFullName()
                + newOutput.cpfMessage() + super.getCpf() + "\n"
                + newOutput.emailMessage() + super.getEmail() + "\n"
                + newOutput.phoneMessage() + super.getPhone()+ "\n"
                + newOutput.functionMessage() + EmployeeType.
                getKey(super.getEmployeeFunction()) + "\n"
                + newOutput.salaryMessage() + this.getSalary() + "\n";

    }

}


