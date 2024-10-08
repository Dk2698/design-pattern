package com.kumar.problem.carrental.service;

import com.kumar.problem.carrental.enums.VehicleType;
import com.kumar.problem.carrental.model.Location;
import com.kumar.problem.carrental.model.User;
import com.kumar.problem.carrental.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int storeId;
    private VehicleInventoryManagement vehicleInventoryManagement;

    private Location storeLocation;

    List<Reservation> reservations = new ArrayList<>();

    public Store(int storeId, Location storeLocation) {
        this.storeId = storeId;
        this.storeLocation = storeLocation;
    }


    public List<Vehicle> getVehicles(VehicleType vehicleType) {
        return vehicleInventoryManagement.getVehicles();
    }


    //addVehicles, update vehicles, use inventory management to update those.

    public void setVehicles(List<Vehicle> vehicles) {
        vehicleInventoryManagement = new VehicleInventoryManagement(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle, User user) {
        Reservation reservation = new Reservation();
        reservation.createReserve(user, vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationID) {

        //take out the reservation from the list and call complete the reservation method.
        return true;
    }


}
