package com.parkinglot.driver;

import com.parkinglot.vehicle.Vehicle;

public class Driver {
    private int id;
    private int paymentDue;
    private Vehicle vehicle;

    public Driver(int id, Vehicle vehicle){
        this.id=id;
        this.vehicle=vehicle;
        this.paymentDue=0;
    }

    public Vehicle getVehicle(){
        return this.vehicle;
    }

    public int getId(){
        return this.id;
    }

    public void charge(int amount){
        this.paymentDue+=amount;
    }
}