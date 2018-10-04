package com.company.model.resourcesFactory;

import com.company.controller.*;
import com.company.view.messagesPackage.ResourcesDefaultMessages;

public abstract class Resources {

    private int resourceType;
    private String identification;
    private boolean status;

    public Resources(int resourceType, String identification){
        SingletonInput newInput = SingletonInput.getInstance();

        this.identification = identification;
        setResourceType(resourceType);
        ResourcesDefaultMessages display = new ResourcesDefaultMessages();
        display.selectResourcesStatus();
        if (newInput.numberedInput(2) == 1){
            this.status = true;
            return;
        }
        this.status = false;
    }


    // all resources methods
    public void setResourceType(int resourceType){
        this.resourceType = resourceType;
    }

    public int getResourceType() {
        return resourceType;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void changeStatus(){
        this.status = !(this.status);
    }


    //bus and stadium methods

    public String toString(){
        throw new UnsupportedOperationException();
    }

    public int getNumOfSeats(){
        throw new UnsupportedOperationException();
    }

    public int getNumOfBathrooms() {
        throw new UnsupportedOperationException();
    }

    public int getNumOfSnackbars() {
        throw new UnsupportedOperationException();
    }

    public void setNumOFSeats(int numOfFans) {
        throw new UnsupportedOperationException();
    }

    public void setNumOfBathrooms(int numOfBathrooms) {
        throw new UnsupportedOperationException();
    }

    public void setNumOfSnackbars(int numOfSnackBars) {
        throw new UnsupportedOperationException();
    }

    //CT methods
    public int getNumOfBedrooms() {
        throw new UnsupportedOperationException();
    }

    public void setNumOfBedrooms(int numOfBedrooms) {
        throw new UnsupportedOperationException();
    }
}

