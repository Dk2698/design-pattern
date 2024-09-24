package com.kumar.visitor.visitor;

import com.kumar.visitor.element.DeluxeRoom;
import com.kumar.visitor.element.DoubleRoom;
import com.kumar.visitor.element.SingleRoom;

public class RoomPricingVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Pricing computation logic of SingleRoom");
        singleRoom.roomPrice = 1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Pricing computation logic of DoubleRoom");
        doubleRoom.roomPrice = 2000;
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Pricing computation logic of DeluxeRoom");
        deluxeRoom.roomPrice = 5000;
    }
}
