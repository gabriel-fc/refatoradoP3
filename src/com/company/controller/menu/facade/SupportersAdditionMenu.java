package com.company.controller.menu.facade;

import com.company.controller.DataManagement.SupporterDataManagement;
import com.company.controller.SingletonInput;
import com.company.model.personPackage.Supporter;
import com.company.view.SingletonMessages;

public class SupportersAdditionMenu {
    public void menu(SupporterDataManagement supporters) {
        SingletonMessages display = SingletonMessages.getInstance();
        SingletonInput newInput = SingletonInput.getInstance();

        display.menuMessages.supportersMenu();
        int function = newInput.numberedInput(4);
        if (function == 4) {
            display.generalMessages.canceledOperation();
            return;
        }
        if (function == 1) {
            supporters.addSupporter();

        } else if (function == 2) {
            display.generalMessages.showMessage(display.membersMessages.cpfMessage());
            String cpf = newInput.longInput();
            Supporter aux = supporters.getSupporter(cpf);

            display.menuMessages.complianceMessage(aux.getSupporterCompliance());
            supporters.changeCompliance(cpf);

        } else if (function == 3) {
            supporters.setCategoryValue();
        }
        menu(supporters);
    }
}
