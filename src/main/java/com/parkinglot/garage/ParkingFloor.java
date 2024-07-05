package com.parkinglot.garage;

import com.parkinglot.driver.Driver;
import com.parkinglot.vehicle.Vehicle;

import java.util.ArrayList;

public class ParkingFloor
{
    private int[] spots;
    private ArrayList<Driver> vehicles;
    public ParkingFloor(int noOfSpots){
        this.spots=new int[noOfSpots];
        this.vehicles = new ArrayList<>();
    }

}
