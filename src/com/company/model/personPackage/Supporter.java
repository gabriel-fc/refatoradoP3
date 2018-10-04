package com.company.model.personPackage;

import com.company.controller.*;
import com.company.view.ToStringFunctions;
import com.company.view.messagesPackage.MembersDefaultMessages;


public class Supporter extends Person {

    private int category;
    private boolean compliance;
    public Supporter(){
        MembersDefaultMessages display = new MembersDefaultMessages();
        SingletonInput newInput = SingletonInput.getInstance();

        display.selectSupporterCategoryMessage();
        category = newInput.numberedInput(3);
        compliance = true;
    }

    public int getSupporterCategory(){
        return this.category;
    }

    public boolean getSupporterCompliance(){
        return this.compliance;
    }

    public void setSupporterCategory() {
        MembersDefaultMessages display = new MembersDefaultMessages();
        display.selectSupporterCategoryMessage();
        SingletonInput newInput = SingletonInput.getInstance();

        this.category = newInput.numberedInput(3);
    }

    public void setSupporterCompliance(boolean compliance) {
        this.compliance = compliance;
    }

    public String toString(){
        MembersDefaultMessages newOutput = new MembersDefaultMessages();
        ToStringFunctions stringFunction = new ToStringFunctions();

        return newOutput.fullNameMessage() + super.getFullName()
                + newOutput.cpfMessage() + super.getCpf()
                + newOutput.emailMessage() + super.getEmail()
                + newOutput.phoneMessage() + super.getPhone()
                + newOutput.supporterCategoryMessage() + stringFunction.toStringSupporterCategory(this.category) + "\n"
                + newOutput.supporterComplianceMessage() + stringFunction.toStringSupporterCompliance(this.compliance);

    }

}
