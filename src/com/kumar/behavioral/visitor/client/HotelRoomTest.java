package com.kumar.behavioral.visitor.client;

import com.kumar.behavioral.visitor.element.DeluxeRoom;
import com.kumar.behavioral.visitor.element.DoubleRoom;
import com.kumar.behavioral.visitor.element.RoomElement;
import com.kumar.behavioral.visitor.element.SingleRoom;
import com.kumar.behavioral.visitor.visitor.RoomMaintenanceVisitor;
import com.kumar.behavioral.visitor.visitor.RoomPricingVisitor;
import com.kumar.behavioral.visitor.visitor.RoomVisitor;

public class HotelRoomTest {
    public static void main(String[] args) {
        RoomElement singleRoom = new SingleRoom();
        RoomElement doubleRoom = new DoubleRoom();
        RoomElement deluxeRoom = new DeluxeRoom();

        // performing an operation on the objects
        RoomVisitor roomPricingVisitor = new RoomPricingVisitor();
        singleRoom.accept(roomPricingVisitor);
        System.out.println(((SingleRoom) singleRoom).roomPrice);

        doubleRoom.accept(roomPricingVisitor);
        System.out.println(((DoubleRoom) doubleRoom).roomPrice);

        deluxeRoom.accept(roomPricingVisitor);
        System.out.println(((DeluxeRoom) deluxeRoom).roomPrice);

        RoomVisitor roomMaintenanceVisitor = new RoomMaintenanceVisitor();
        singleRoom.accept(roomMaintenanceVisitor);

        doubleRoom.accept(roomMaintenanceVisitor);

        deluxeRoom.accept(roomMaintenanceVisitor);


    }

}
