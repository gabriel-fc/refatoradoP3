package com.company.controller.menu.facade;

import com.company.controller.DataManagement.ResourceDataManagement;
import com.company.controller.SingletonInput;
import com.company.view.SingletonMessages;

public class ResourcesManagementMenu {

    public void menu(ResourceDataManagement resources){
        SingletonInput newInput = SingletonInput.getInstance();
        SingletonMessages display = SingletonMessages.getInstance();

        display.menuMessages.resourcesManagementMessage();
        int function = newInput.numberedInput(4);
        if (function == 4){
            display.generalMessages.canceledOperation();
            return;
        }
        String identification;
        display.generalMessages.showMessage(display.resourcesMessages.resourceIdentificationMessage());
        identification = newInput.simpleString();
        if (resources.getResource(identification) != null) {
            resources.printResource(identification);
        }

        else {
            display.generalMessages.showMessage(display.resourcesMessages.resourceIdentificationMessage() + display.generalMessages.additionQuestion());

            if (newInput.numberedInput(2) == 2) {
                display.generalMessages.canceledOperation();
                return;
            }
            display.resourcesMessages.setTypeMessage();
            function = newInput.numberedInput(3);
            resources.addResource(function, identification);
        }
        menu(resources);
    }
}
