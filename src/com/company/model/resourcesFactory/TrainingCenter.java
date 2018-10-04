package com.company.model.resourcesFactory;

import com.company.controller.*;
import com.company.view.ToStringFunctions;
import com.company.view.messagesPackage.ResourcesDefaultMessages;
import com.company.view.SingletonMessages;

public class TrainingCenter extends Resources {
    private int numOfBedrooms;
    public TrainingCenter(int resourceType, String identification){
        super(resourceType, identification);
        SingletonMessages display = SingletonMessages.getInstance();
        SingletonInput newInput = SingletonInput.getInstance();

        display.generalMessages.showMessage(display.resourcesMessages.numOfBedroomsTC());
        this.numOfBedrooms = newInput.integerInput();
    }

    public int getNumOfBedrooms() {
        return this.numOfBedrooms;
    }

    public void setNumOfBedrooms(int numOfBedrooms) {
        this.numOfBedrooms = numOfBedrooms;
    }

    public String toString(){
        ToStringFunctions aux = new ToStringFunctions();
        ResourcesDefaultMessages display = new ResourcesDefaultMessages();

        return display.resourceTypeMessage() + aux.toStringResourceType(getResourceType()) + "\n"
                + display.resourceIdentificationMessage() + getIdentification()+ "\n"
                + display.resourceDisponibilityMessage() + aux.toStringResourceStatus(getStatus())+ "\n"
                + display.numOfBedroomsTC() + this.numOfBedrooms+ "\n";
    }

}

