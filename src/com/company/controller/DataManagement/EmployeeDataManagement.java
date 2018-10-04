package com.company.controller.DataManagement;

import com.company.model.personPackage.employeeFactory.EmployeeFactory;
import com.company.model.personPackage.employeeFactory.*;
import com.company.view.SingletonMessages;

import java.util.ArrayList;

public class EmployeeDataManagement {
    private ArrayList<Employee> regularEmployeeArrayList = new ArrayList<>();
    private ArrayList<Employee> teamArrayList = new ArrayList<>();

    private Employee president = null;
    private Employee coach = null;


    public void addEmployee(int employeeFunction){
         EmployeeFactory factory = new EmployeeFactory();
         Employee newEmployee = factory.createEmployee(employeeFunction);
        SingletonMessages display = SingletonMessages.getInstance();

         if (employeeFunction == 1){
            president = newEmployee;

        } else if (employeeFunction == 3){
             coach = newEmployee;

         }else if (employeeFunction == 8) {
            teamArrayList.add(newEmployee);

         }else {
                regularEmployeeArrayList.add(newEmployee);
        }
        display.generalMessages.successfullOperation();
    }

    public Employee getEmployee(String cpf){
        SingletonMessages display = SingletonMessages.getInstance();

        if (president != null && president.getCpf().compareTo(cpf) == 0){
            return president;
        }
        if (coach != null && coach.getCpf().compareTo(cpf) == 0){
            return coach;
        }

        for (int i = 0; i < regularEmployeeArrayList.size(); i++) {
            if ((regularEmployeeArrayList.get(i).getCpf()).compareTo(cpf) == 0){
                return regularEmployeeArrayList.get(i);
            }
        }
        for (int i = 0; i < teamArrayList.size(); i++) {
            if ((teamArrayList.get(i).getCpf()).compareTo(cpf) == 0){
                return teamArrayList.get(i);
            }
        }
        display.generalMessages.employeeNotfound();
        return null;
    }

    public Employee getCoach(){
        return coach;
    }

    public Employee getPresident() {
        return president;
    }

    public void printEmployee(String cpf){
        SingletonMessages display = SingletonMessages.getInstance();
        Employee aux = getEmployee(cpf);

        if (aux == null){
            return;
        }
        display.generalMessages.showMessage(aux.toString());
        display.generalMessages.successfullOperation();
    }

    public void printPlayersReport(){
        SingletonMessages display = SingletonMessages.getInstance();
        display.generalMessages.team();
        display.generalMessages.showMessage("Treinador:");
        if (coach != null){
            display.generalMessages.showMessage(coach.toString());
        }else{
            display.generalMessages.employeeNotfound();
        }
        display.generalMessages.showMessage("Jogadores:\n");
        for (int i = 0; i <teamArrayList.size(); i++) {
            display.generalMessages.showMessage(teamArrayList.get(i).toString());

        }
        display.generalMessages.successfullOperation();
    }

    public void printRegularEmployeesReport(){
        SingletonMessages display = SingletonMessages.getInstance();

        display.generalMessages.showMessage("Presidente:");
        if (president != null){
            display.generalMessages.showMessage(president.toString());
        }else{
            display.generalMessages.employeeNotfound();
        }
        display.generalMessages.showMessage("Outros funcionários:\n");
        for (int i = 0; i <regularEmployeeArrayList.size(); i++) {
            display.generalMessages.showMessage(regularEmployeeArrayList.get(i).toString());

        }
        display.generalMessages.successfullOperation();
    }
    
}
