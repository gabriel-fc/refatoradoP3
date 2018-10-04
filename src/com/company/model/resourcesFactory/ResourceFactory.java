package com.company.model.resourcesFactory;

public class ResourceFactory {

    public Resources createResource(int resourceType, String identification){
        switch (resourceType){
            case 1:
                return new Bus(resourceType, identification);
            case 2:
                return new Stadium(resourceType, identification);
            case 3:
                return new TrainingCenter(resourceType, identification);
            default:
                return null;
        }

    }
}
