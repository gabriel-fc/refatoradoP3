package com.company.controller.DataManagement;

import com.company.controller.SingletonInput;
import com.company.model.personPackage.Supporter;
import com.company.view.*;

import java.util.ArrayList;

public class SupporterDataManagement {
    private ArrayList <Supporter> defaulterArrayList = new ArrayList<>();
    private ArrayList <Supporter> defaultingArrayList = new ArrayList<>();
    private float[] categoryValues = new float[3];

    public SupporterDataManagement(){
        for (int i = 0; i < 3; i++) {
            categoryValues[i] = -1;
        }
    }

    public void setCategoryValue(){
        SingletonMessages display = SingletonMessages.getInstance();
        int key;
        float aux;
        SingletonInput newInput = SingletonInput.getInstance();

        display.membersMessages.setCategoryValueMessage();
        key = newInput.numberedInput(4);

        if(key == 4){
            display.generalMessages.canceledOperation();
            return;

        }
        display.membersMessages.typeNewCategoryValueMessage();
        aux =newInput.floatInput();
        if(key == 1) {
            categoryValues[0] = aux;
            display.generalMessages.successfullOperation();
        }
        else if (key == 2) {
            categoryValues[1] = aux;
            display.generalMessages.successfullOperation();
        }else if (key == 3) {
            categoryValues[2] = aux;
           display.generalMessages.successfullOperation();
        }
        setCategoryValue();
    }

    public void addSupporter(){
        SingletonMessages display = SingletonMessages.getInstance();
        Supporter newSupporter = new Supporter();

        this.defaulterArrayList.add(newSupporter);
        display.generalMessages.successfullOperation();

    }

    public void changeCompliance(String cpf){
        SingletonMessages display = SingletonMessages.getInstance();
        Supporter aux = getSupporter(cpf);
        if (aux == null){
            display.generalMessages.employeeNotfound();
            display.generalMessages.canceledOperation();
            return;
        }
        if (aux.getSupporterCompliance()){
            defaultingArrayList.add(aux);
            defaulterArrayList.remove(aux);
        }else{
            defaulterArrayList.add(aux);
            defaultingArrayList.remove(aux);
        }
        display.generalMessages.successfullOperation();
    }

    public Supporter getSupporter(String cpf){
        SingletonMessages display = SingletonMessages.getInstance();

        Supporter aux;
        for (int i = 0; i < defaulterArrayList.size(); i++) {
            aux = defaulterArrayList.get(i);
            if (aux.getCpf().compareTo(cpf) == 0){
                return aux;
            }
        }
        for (int i = 0; i < defaultingArrayList.size(); i++) {
            aux = defaultingArrayList.get(i);
            if (aux.getCpf().compareTo(cpf) == 0){
                return aux;
            }
        }
        display.generalMessages.supporterNotfound();
        return null;
    }

    public void printSupporter(String cpf){
        SingletonMessages display = SingletonMessages.getInstance();
        Supporter aux = getSupporter(cpf);

        if (aux == null){
            return;
        }
        display.generalMessages.showMessage(aux.toString());
        display.generalMessages.successfullOperation();
    }

    public void printDefaulterReport(){
        SingletonMessages display = SingletonMessages.getInstance();

        display.membersMessages.supporterQuantity(defaulterArrayList.size() + defaultingArrayList.size());
        display.membersMessages.defaulterMessage();
        for (int i = 0; i < defaulterArrayList.size(); i++) {
            display.generalMessages.showMessage(defaulterArrayList.get(i).toString());
        }

    }

    public void printDefaultingReport(){
        SingletonMessages display = SingletonMessages.getInstance();

        display.membersMessages.defaultingMessage();
        for (int i = 0; i < defaultingArrayList.size(); i++) {
            display.generalMessages.showMessage(defaultingArrayList.get(i).toString());
        }
    }

    public void printReport(){
        SingletonMessages display = SingletonMessages.getInstance();

        printDefaulterReport();
        display.generalMessages.showMessage("\n");
        printDefaultingReport();
    }

    public int numOfSupporters(){
        return defaulterArrayList.size() + defaultingArrayList.size();
    }

}
