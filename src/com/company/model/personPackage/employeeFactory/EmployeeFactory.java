package com.company.model.personPackage.employeeFactory;

public class EmployeeFactory {

    public Employee createEmployee(int employeeFunction){
        switch (employeeFunction){
            case 1:
                return new GeneralEmployee(employeeFunction);
            case 2:
                return new Doctor(employeeFunction);
            case 3:
                return new GeneralEmployee(employeeFunction);
            case 4:
                return new GeneralEmployee(employeeFunction);
            case 5:
                return new Driver(employeeFunction);
            case 6:
                return new GeneralEmployee(employeeFunction);
            case 7:
                return new GeneralEmployee(employeeFunction);
            case 8:
                return new FootballPlayer(employeeFunction);
            default:
                return null;

        }
    }
}
