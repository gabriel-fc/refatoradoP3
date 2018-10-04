package com.company.controller.menu.facade;

public class Facade {
    private EmployeeAdditionMenu employeeAdditionMenu;
    private SupportersAdditionMenu supportersAdditionMenu;
    private ResourcesManagementMenu resourcesManagementMenu;
    private ReportsMenu reportsMenu;

    public Facade(){
        this.employeeAdditionMenu = new EmployeeAdditionMenu();
        this.supportersAdditionMenu = new SupportersAdditionMenu();
        this.resourcesManagementMenu = new ResourcesManagementMenu();
        this.reportsMenu = new ReportsMenu();
    }

    public EmployeeAdditionMenu getEmployeeAdditionMenu() {
        return employeeAdditionMenu;
    }

    public SupportersAdditionMenu getSupportersAdditionMenu() {
        return supportersAdditionMenu;
    }

    public ResourcesManagementMenu getResourcesManagementMenu() {
        return resourcesManagementMenu;
    }

    public ReportsMenu getReportsMenu() {
        return reportsMenu;
    }
}
