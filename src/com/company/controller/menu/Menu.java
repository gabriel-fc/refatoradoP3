package com.company.controller.menu;

import com.company.controller.DataManagement.*;
import com.company.controller.SingletonInput;
import com.company.controller.menu.facade.Facade;
import com.company.securityPackage.SingletonLogin;
import com.company.view.SingletonMessages;

public class Menu {


    public void mainMenu(EmployeeDataManagement employees, SupporterDataManagement supporters, ResourceDataManagement resources ){
        SingletonMessages display = SingletonMessages.getInstance();
        SingletonInput newInput = SingletonInput.getInstance();
        SingletonLogin login = SingletonLogin.getInstance();
        Facade menuOptions = new Facade();

        int option;
        if (!login.isValidated()){
            login.validation();
            if (!login.isValidated()){
                display.generalMessages.endOfProgramMessage();
                return;
            }
        }

        display.menuMessages.mainMenuMessage();
        option = newInput.numberedInput(5);

        switch (option) {
            case 1:
                menuOptions.getEmployeeAdditionMenu().menu(employees);break;
            case 2:
                menuOptions.getSupportersAdditionMenu().menu(supporters);break;
            case 3:
                menuOptions.getResourcesManagementMenu().menu(resources);break;
            case 4:
                menuOptions.getReportsMenu().menu(employees, supporters, resources);break;
            case 5:
                display.generalMessages.endOfProgramMessage(); return;
        }

        mainMenu(employees, supporters, resources);
    }



}
