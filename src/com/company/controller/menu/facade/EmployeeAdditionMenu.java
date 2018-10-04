package com.company.controller.menu.facade;

import com.company.controller.DataManagement.EmployeeDataManagement;
import com.company.controller.SingletonInput;
import com.company.view.SingletonMessages;

public class EmployeeAdditionMenu {

    public void menu(EmployeeDataManagement employees){
        SingletonMessages display = SingletonMessages.getInstance();;
        SingletonInput newInput = SingletonInput.getInstance();

        display.menuMessages.employeesMenu();
        int function = newInput.numberedInput(9);
        if(function == 9){
            display.generalMessages.canceledOperation();
            return;
        }
        employees.addEmployee(function);
    }
}
