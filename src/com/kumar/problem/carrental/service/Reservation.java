package com.kumar.problem.carrental.service;

import com.kumar.problem.carrental.enums.ReservationStatus;
import com.kumar.problem.carrental.enums.ReservationType;
import com.kumar.problem.carrental.model.Location;
import com.kumar.problem.carrental.model.User;
import com.kumar.problem.carrental.model.Vehicle;

import java.util.Date;

public class Reservation {

    private int reservationId;
    private User user;
    private Vehicle vehicle;
    private Date bookingDate;
    private Date dateBookedFrom;
    private Date dateBookedTo;
    private Long fromTimeStamp;
    private Long toTimeStamp;
    private Location pickUpLocation;
    private Location dropLocation;
    private ReservationType reservationType;
    private ReservationStatus reservationStatus;
    private Location location;

    public int getReservationId() {
        return reservationId;
    }

    public int createReserve(User user, Vehicle vehicle) {

        //generate new id
        reservationId = 122321111;
        this.user = user;
        this.vehicle = vehicle;
        reservationType = ReservationType.DAILY;
        reservationStatus = ReservationStatus.SCHEDULED;

        return reservationId;
    }

    // CRUD operations

}
