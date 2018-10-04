package com.company.controller.menu.facade;

import com.company.controller.DataManagement.EmployeeDataManagement;
import com.company.controller.DataManagement.ResourceDataManagement;
import com.company.controller.DataManagement.SupporterDataManagement;
import com.company.controller.SingletonInput;
import com.company.view.SingletonMessages;

public class ReportsMenu {
    public void menu(EmployeeDataManagement employees, SupporterDataManagement supporters, ResourceDataManagement resources) {
        SingletonInput newInput = SingletonInput.getInstance();
        SingletonMessages display = SingletonMessages.getInstance();

        display.menuMessages.reportsMenu();
        int function = newInput.numberedInput(4);
        if (function == 4){
            display.generalMessages.canceledOperation();
            return;
        }

        if (function == 1){
            display.menuMessages.employeesReportMenu();

            if (newInput.numberedInput(2) == 1){
                display.menuMessages.teamReportMenu();

                if (newInput.numberedInput(2) == 1){
                    employees.printPlayersReport();
                }else{
                    display.generalMessages.showMessage(display.membersMessages.cpfMessage());
                    String cpf = newInput.longInput();
                    employees.printEmployee(cpf);
                }
            }else{
                display.generalMessages.regularEmployees();
                employees.printRegularEmployeesReport();
            }

        }else if (function == 2){
            display.generalMessages.resources();
            resources.printReport();

        }else if (function == 3){
            display.menuMessages.supportersReportMenu();

            while (function != 5) {

                function = newInput.numberedInput(5);
                if (function == 5){
                    display.generalMessages.canceledOperation();
                }
                if (function == 1){
                    display.membersMessages.supporterQuantity(supporters.numOfSupporters());

                }else if (function == 2){
                    supporters.printDefaulterReport();

                }else if (function == 3){
                    supporters.printDefaultingReport();

                }else if (function == 4){
                    supporters.printReport();
                }
            }
        }
        menu(employees, supporters, resources);

    }

}
