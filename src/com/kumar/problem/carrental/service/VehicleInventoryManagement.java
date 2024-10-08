package com.kumar.problem.carrental.service;

import com.kumar.problem.carrental.model.Vehicle;

import java.util.List;

public class VehicleInventoryManagement {

    private List<Vehicle> vehicles;

    VehicleInventoryManagement(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

}
