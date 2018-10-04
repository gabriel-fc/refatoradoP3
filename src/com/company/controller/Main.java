package com.company.controller;


import com.company.controller.DataManagement.*;
import com.company.controller.menu.Menu;

public class Main {

    public static void main(String[] args) {
        EmployeeDataManagement employees = new EmployeeDataManagement();
        SupporterDataManagement supporters = new SupporterDataManagement();
        ResourceDataManagement resources = new ResourceDataManagement();
        Menu menu = new Menu();
        menu.mainMenu( employees, supporters, resources);
    }
}
