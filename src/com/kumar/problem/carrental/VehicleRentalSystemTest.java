package com.kumar.problem.carrental;

import com.kumar.problem.carrental.enums.VehicleType;
import com.kumar.problem.carrental.model.Car;
import com.kumar.problem.carrental.model.Location;
import com.kumar.problem.carrental.model.User;
import com.kumar.problem.carrental.model.Vehicle;
import com.kumar.problem.carrental.service.*;


import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystemTest {
    public static void main(String[] args) {
        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicles();
        List<Store> stores = addStores(vehicles);

        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(stores, users);

        // first user
        User user = users.get(0);

        //1. user search store based on location
        Location location = new Location("nexus", 403012, "Bangalore", "Karnataka", "India");
        Store store = rentalSystem.getStore(location);

        //2. get All vehicles you are interested in (based upon different filters)
        List<Vehicle> storeVehicles = store.getVehicles(VehicleType.CAR);


        //3.reserving the particular vehicle
        Reservation reservation = store.createReservation(storeVehicles.get(0), users.get(0));

        //4. generate the bill
        Bill bill = new Bill(reservation);

        //5. make payment
        Payment payment = new Payment();
        payment.payBill(bill);

        //6. trip completed, submit the vehicle and close the reservation
        store.completeReservation(reservation.getReservationId());

    }


    public static List<Vehicle> addVehicles() {

        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle vehicle = new Car();
        vehicle.setVehicleId(1);
        vehicle.setVehicleType(VehicleType.CAR);

        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleId(2);
        vehicle1.setVehicleType(VehicleType.CAR);

        vehicles.add(vehicle);
        vehicles.add(vehicle1);

        return vehicles;
    }

    public static List<User> addUsers() {

        List<User> users = new ArrayList<>();
        User user = new User();
        user.setUserId("1111");
        user.setUserName("kumar");
        user.setDrivingLicense("xyxyxy123");
        users.add(user);

        return users;
    }

    public static List<Store> addStores(List<Vehicle> vehicles) {

        List<Store> stores = new ArrayList<>();

       Location location =  new Location("landmark", 110011,"Delhi", "Delhi","IN");
        Store store = new Store(1, location);
        store.setVehicles(vehicles);

        stores.add(store);
        return stores;
    }
}
