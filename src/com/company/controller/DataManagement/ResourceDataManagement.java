package com.company.controller.DataManagement;

import com.company.model.resourcesFactory.*;
import com.company.view.*;
import com.company.view.ToStringFunctions;


import java.util.ArrayList;

public class ResourceDataManagement  {
    private ArrayList <Resources> busArrayList = new ArrayList<>();
    private ArrayList <Resources> stadiumArrayList = new ArrayList<>();
    private ArrayList <Resources> cTArrayList = new ArrayList<>();

    public void addResource(int resourceType, String identification){
        ResourceFactory factory = new ResourceFactory();
        Resources newResource = factory.createResource(resourceType, identification);
        SingletonMessages display = SingletonMessages.getInstance();

            if(resourceType == 1) {
                busArrayList.add(newResource);
            }else if (resourceType == 2) {
                stadiumArrayList.add(newResource);
            }else {
                cTArrayList.add(newResource);
            }

            display.generalMessages.successfullOperation();
    }

    public Resources getResource(String identification){
        SingletonMessages display = SingletonMessages.getInstance();
        for (int i = 0; i < busArrayList.size(); i++) {
            if (busArrayList.get(i).getIdentification().compareTo(identification) == 0){
                return busArrayList.get(i);
            }
        }

        for (int i = 0; i < stadiumArrayList.size(); i++) {
            if (stadiumArrayList.get(i).getIdentification().compareTo(identification) == 0){
                return stadiumArrayList.get(i);
            }
        }

        for (int i = 0; i < cTArrayList.size(); i++) {
            if (cTArrayList.get(i).getIdentification().compareTo(identification) == 0){
                return cTArrayList.get(i);
            }
        }

        display.generalMessages.resourceNotfound();
        return null;
    }

    public void isAvailable(int type) {
        SingletonMessages display = SingletonMessages.getInstance();
        boolean availability = false;
            if (type == 1) {

                for (int i = 0; i < busArrayList.size(); i++) {
                    if (busArrayList.get(i).getStatus()){
                        availability = !availability;
                        break;
                    }
                }
            }else if(type == 2) {
                for (int i = 0; i < stadiumArrayList.size(); i++) {
                    if (stadiumArrayList.get(i).getStatus()){
                        availability = !availability;
                        break;
                    }
                }
            }else {
                for (int i = 0; i < cTArrayList.size(); i++) {
                    if (cTArrayList.get(i).getStatus()){
                        availability = !availability;
                        break;
                    }
                }
            }
        ToStringFunctions aux = new ToStringFunctions();

        display.generalMessages.showMessage(display.resourcesMessages.resourceDisponibilityMessage() + aux.toStringResourceStatus(availability));
    }

    public void printResource(String identification){
        SingletonMessages display = SingletonMessages.getInstance();

        Resources aux = getResource(identification);

        if (aux == null){
            return;
        }

        display.generalMessages.showMessage(aux.toString());
    }

    public void printReport(){
        SingletonMessages display = SingletonMessages.getInstance();

        display.generalMessages.showMessage("Transporte:\n");
        for (int i = 0; i < busArrayList.size(); i++) {
            display.generalMessages.showMessage(busArrayList.get(i).toString());
        }
        display.generalMessages.showMessage("Centro de treinamento:\n");
        for (int i = 0; i < cTArrayList.size(); i++) {
            display.generalMessages.showMessage(cTArrayList.get(i).toString());
        }
        display.generalMessages.showMessage("Estádio:\n");
        for (int i = 0; i < stadiumArrayList.size(); i++) {
            display.generalMessages.showMessage(stadiumArrayList.get(i).toString());
        }
    }
}
