package com.company.model.resourcesFactory;

public class Bus extends Resources {
    private int numOfSeats;

    Bus(int resourceType, String identification){
        super(resourceType, identification);
    }

    public int getNumOfSeats(){
        throw new UnsupportedOperationException();
    }

    public void setNumOFSeats(int numOfFans) {
        this.numOfSeats = numOfFans;
    }
}
