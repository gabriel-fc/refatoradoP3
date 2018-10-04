package com.company.model.personPackage.employeeFactory;

import com.company.controller.*;
import com.company.model.enums.EmployeeType;
import com.company.model.enums.PlayerFunction;
import com.company.view.*;
import com.company.view.messagesPackage.MembersDefaultMessages;

public class FootballPlayer extends Employee {
    private int playerFunction;
    private int playerStatus;

    public FootballPlayer(int employeeFunction) {
        super(employeeFunction);
        SingletonInput newInput = SingletonInput.getInstance();
        SingletonMessages display = SingletonMessages.getInstance();

        display.generalMessages.showMessage(display.membersMessages.playerFunctionMessage());
        this.playerFunction = newInput.numberedInput(7);
        display.generalMessages.showMessage(display.membersMessages.playerStatusMessage());
        this.playerStatus = newInput.numberedInput(3);
    }

    public int getPlayerFunction() {
        return this.playerFunction;
    }


    public int getPlayerStatus(){
        return this.playerStatus;
    }

    public void setPlayerFunction(int playerFunction) {
        this.playerFunction = playerFunction;
    }

    public void setPlayerStatus(int playerStatus) {

        this.playerStatus = playerStatus;
    }

    public String toString(){
        MembersDefaultMessages newOutput = new MembersDefaultMessages();
        ToStringFunctions stringFunction = new ToStringFunctions();

        return newOutput.fullNameMessage() + super.getFullName()
                + newOutput.cpfMessage() + super.getCpf()
                + newOutput.emailMessage() + super.getEmail()
                + newOutput.phoneMessage() + super.getPhone()
                + newOutput.functionMessage() + EmployeeType.
                getKey(super.getEmployeeFunction())
                + newOutput.salaryMessage() + super.getSalary()
                + "\nPosição do jogador: " + PlayerFunction.getKey(this.playerFunction)+ "\n"
                + "Status do jogador: " + stringFunction.toStringPlayerStatus(this.playerStatus);

    }
}